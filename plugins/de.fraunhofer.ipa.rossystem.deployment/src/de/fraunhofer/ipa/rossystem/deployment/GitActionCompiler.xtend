package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers

class GitActionCompiler {
	
	GeneratorHelpers generator_helper = new GeneratorHelpers()
 
 def get_name(String prefix, String ros_distro) {
 	if(ros_distro=="foxy") {
 		return prefix + "_ros2"
 	}
 	else{
 		return prefix + ros_distro
 	}
 }
 
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
      name: Get Branch
      id: extract_branch
      run: echo ::set-output name=branch::$(echo ${GITHUB_REF#refs/heads/} | sed 's/[^a-zA-Z0-9-]/_/g')
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
	«default_part("extra_layer_"+name, String.join("/", ".",path,"extra_layer"), null, "type=raw,value=${{ steps.extract_branch.outputs.branch }}")»
''' 
 def system_layer(String sys_name, Boolean need_extra)'''
	«IF need_extra» 
	«default_part(sys_name, "./"+sys_name, "extra_layer_"+sys_name, "type=raw,value=${{ steps.extract_branch.outputs.branch }}")»
	«ELSE»
	«default_part(sys_name, "./"+sys_name, null, "type=raw,value=${{ steps.extract_branch.outputs.branch }}")»
	«ENDIF»
	''' 	
 def stack_layer(String sys_name, String stack_name, String ros_distro, Boolean need_extra)'''
	«IF need_extra» 
	«default_part(get_name(sys_name, ros_distro)+"_"+stack_name, String.join("/", ".",get_name(sys_name, ros_distro), sys_name+"_"+stack_name), "extra_layer_"+get_name(stack_name, ros_distro), "type=raw,value=${{ steps.extract_branch.outputs.branch }}")»
	«ELSE»
	«default_part(get_name(sys_name, ros_distro)+"_"+stack_name, String.join("/", ".",get_name(sys_name, ros_distro), sys_name+"_"+stack_name), null, "type=raw,value=${{ steps.extract_branch.outputs.branch }}")»
	«ENDIF»
''' 	
 def compile_toGitAction(RosSystem system, Integer ros_version, String ros_distro) '''«generator_helper.init_pkg()»
name: «get_name(system.name.toLowerCase, ros_distro)»
on:
  push:
    paths:
      - '«get_name(system.name.toLowerCase, ros_distro)»/**'
env:
  PREFIX: "${{ secrets.DOCKER_USERNAME }}/"
  SUFFIX: ""
«««  Todo: get distro from model
  BUILDER_SUFFIX: ros«ros_version»
jobs:
  «IF system.getComponentStack().isEmpty()»
  «IF !generator_helper.listOfRepos(system).isEmpty()»
  «extra_layer(get_name(system.name.toLowerCase, ros_distro), get_name(system.name.toLowerCase, ros_distro))»
  «system_layer(get_name(system.name.toLowerCase, ros_distro), true)»
	«ELSE»
  «system_layer(get_name(system.name.toLowerCase, ros_distro), false)»
«ENDIF»
«ELSE»«FOR stack : system.getComponentStack()»«IF !generator_helper.listOfRepos(stack).isEmpty()»
  «extra_layer(get_name(stack.name.toLowerCase, ros_distro), String.join("/", get_name(system.name.toLowerCase, ros_distro), system.name.toLowerCase + "_" + stack.name.toLowerCase))»
  «stack_layer(system.name.toLowerCase, stack.name.toLowerCase, ros_distro, true)»
 «ELSE»
  «stack_layer(system.name.toLowerCase, stack.name.toLowerCase, ros_distro, false)»
«ENDIF»
 «ENDFOR»
«ENDIF»           
'''
}