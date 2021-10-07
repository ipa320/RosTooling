package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers

class GitActionCompiler {
	
	GeneratorHelpers generator_helper = new GeneratorHelpers()
 
 def default_part(String layer, String context_path, String needed_layer, String tag)'''
«layer»:
  runs-on: ubuntu-latest
  «IF needed_layer !== null»
  needs: «needed_layer»
  «ENDIF»
  steps:
    -
      name: Checkout
      uses: actions/checkout@v2
    - name: Log in to Docker Hub
      uses: docker/login-action@v1
      with:
        username: ${{ secrets.DOCKER_USERNAME }}
        password: ${{ secrets.DOCKER_PASSWORD }}
    -
      name: Set up QEMU
      uses: docker/setup-qemu-action@v1
    -
      name: Set up Docker Buildx
      uses: docker/setup-buildx-action@v1
      with:
        driver-opts: network=host
    -
      name: Cache Docker layers
      uses: actions/cache@v2
      with:
        path: /tmp/.buildx-cache
        key: ${{ runner.os }}-buildx-${{ github.sha }}
        restore-keys: |
          ${{ runner.os }}-buildx-
    -
      name: Docker meta
      id: docker_meta
      uses: docker/metadata-action@v3
      with:
        images: ${{ secrets.DOCKER_USERNAME }}/${{ github.job }}
        tags: |
          «tag»
          type=raw,value=latest
    -
      name: Get Branch
      id: extract_branch
      run: echo ::set-output name=branch::$(echo ${GITHUB_REF} | cut -d'/' -f3)
    -
      name: Build and Push Docker Image
      uses: docker/build-push-action@v2
      with:
        context: «context_path»
        push: true
        tags: ${{ steps.docker_meta.outputs.tags }}
        labels: ${{ steps.docker_meta.outputs.labels }}
        build-args: |
          SUFFIX=:${{ steps.extract_branch.outputs.branch }}
          BUILDER_SUFFIX=:${{ env.BUILDER_SUFFIX }}
          PREFIX=${{ env.PREFIX }}
        cache-from: type=local,src=/tmp/.buildx-cache
        cache-to: type=local,dest=/tmp/.buildx-cache-new,mode=max
    -
      name: Move cache
      run: |
        rm -rf /tmp/.buildx-cache
        mv /tmp/.buildx-cache-new /tmp/.buildx-cache
 '''
 def build_layer()'''
	«default_part("builder", "./builder", null, "type=raw,value=${{ env.BUILDER_SUFFIX }}")» 
'''
 def extra_layer(String name, String path)'''
	«default_part("extra_layer_"+name, String.join("/", ".",path,"extra_layer"), "builder", "type=ref,event=branch")»
''' 
 def system_layer(String sys_name, Boolean need_extra)'''
	«IF need_extra» 
	«default_part(sys_name, "./"+sys_name, "extra_layer_"+sys_name, "type=ref,event=branch")»
	«ELSE»
	«default_part(sys_name, "./"+sys_name, "builder", "type=ref,event=branch")»
	«ENDIF»
	''' 	
 def stack_layer(String sys_name, String stack_name, Boolean need_extra)'''
	«IF need_extra» 
	«default_part(sys_name+"_"+stack_name, String.join("/", ".",sys_name, sys_name+"_"+stack_name), "extra_layer_"+stack_name, "type=ref,event=branch")»
	«ELSE»
	«default_part(sys_name+"_"+stack_name, String.join("/", ".",sys_name, sys_name+"_"+stack_name), "builder", "type=ref,event=branch")»
	«ENDIF»
''' 	
 def compile_toGitAction(RosSystem system, Integer ros_version) '''«generator_helper.init_pkg()»
name: «system.name.toLowerCase»
on:
  push:
    paths:
      - '«system.name.toLowerCase»/**'
env:
  PREFIX: "${{ secrets.DOCKER_USERNAME }}/"
  SUFFIX: ""
«««  Todo: get distro from model
  BUILDER_SUFFIX: ros«ros_version»
jobs:
  «build_layer()»
  «IF system.getComponentStack().isEmpty()»
  «IF !generator_helper.listOfRepos(system).isEmpty()»
  «extra_layer(system.name.toLowerCase, system.name.toLowerCase)»
  «system_layer(system.name.toLowerCase, true)»
	«ELSE»
  «system_layer(system.name.toLowerCase, false)»
«ENDIF»
«ELSE»«FOR stack : system.getComponentStack()»«IF !generator_helper.listOfRepos(stack).isEmpty()»
  «extra_layer(stack.name.toLowerCase, String.join("/", system.name.toLowerCase, system.name.toLowerCase + "_" + stack.name.toLowerCase))»
  «stack_layer(system.name.toLowerCase, stack.name.toLowerCase, true)»
 «ELSE»
  «stack_layer(system.name.toLowerCase, stack.name.toLowerCase, false)»
«ENDIF»
 «ENDFOR»
«ENDIF»           
'''
}