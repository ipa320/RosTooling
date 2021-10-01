package de.fraunhofer.ipa.rossystem.deployment

import rossystem.RosSystem
import rossystem.ComponentStack
import de.fraunhofer.ipa.rossystem.generator.GeneratorHelpers

class DockerContainerCompiler {
	GeneratorHelpers generator_helper = new GeneratorHelpers() 

    def compile_toDockerContainer(RosSystem system, ComponentStack stack) '''«generator_helper.init_pkg()»
# syntax=docker/dockerfile:experimental
ARG SUFFIX=
ARG BUILDER_SUFFIX=:melodic
ARG PREFIX=
«IF stack===null»
    «IF generator_helper.listOfRepos(system).isEmpty()»
FROM ros:melodic-ros-core as base
    «ELSE»
FROM ${PREFIX}extra_layer_«system.name.toLowerCase»${SUFFIX} as base
    «ENDIF»
«ELSE»
    «IF generator_helper.listOfRepos(stack).isEmpty()»
FROM ros:melodic-ros-core as base
    «ELSE»
FROM ${PREFIX}extra_layer_«stack.name.toLowerCase»${SUFFIX} as base
    «ENDIF»
«ENDIF»
FROM ${PREFIX}builder${BUILDER_SUFFIX} as builder

FROM base as build
COPY . /root/ws/src/«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»/
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash build_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM build as test
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash test_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM build as install
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash install_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM install as full
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash install_depends /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM base as deploy
RUN --mount=type=bind,from=builder,target=/builder --mount=type=bind,target=/root/ws,from=install,source=/root/ws \
    apt-get update -qq && \
    /builder/workspace.bash install_depends /root/ws && \
    rm -rf /var/lib/apt/lists/*
COPY --from=install /opt/ros/$ROS_DISTRO /opt/ros/$ROS_DISTRO

FROM deploy as launch
«IF stack===null»CMD ["roslaunch", "«system.name»", "«system.name».launch"]«ELSE»CMD ["roslaunch", "«system.name.toLowerCase»_«stack.name.toLowerCase»", "«stack.name.toLowerCase».launch"]«ENDIF»
'''

    def compile_toDockerImageExtraLayer(RosSystem system, ComponentStack stack) '''«generator_helper.init_pkg()»
«IF (stack===null && !generator_helper.listOfRepos(system).isEmpty()) || (stack !==null && !generator_helper.listOfRepos(stack).isEmpty()) »
# syntax=docker/dockerfile:experimental
ARG SUFFIX=
ARG PREFIX=
«««Todo: get distro from model
ARG BUILDER_SUFFIX=:melodic
FROM ros:melodic-ros-core as base
FROM ${PREFIX}builder${BUILDER_SUFFIX} as builder

FROM base as pre_build
COPY * /root/ws/src/
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash update_list /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM pre_build as build
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash build_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM build as test
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash test_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM build as install
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash install_workspace /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM install as full
RUN --mount=type=bind,from=builder,target=/builder \
    apt-get update -qq && \
    /builder/workspace.bash install_depends /root/ws && \
    rm -rf /var/lib/apt/lists/*

FROM pre_build as deploy
RUN --mount=type=bind,from=builder,target=/builder \
    --mount=type=bind,target=/root/ws,from=install,source=/root/ws \
    apt-get update -qq && \
    /builder/workspace.bash install_depends /root/ws && \
    rm -rf /var/lib/apt/lists/*
COPY --from=install /opt/ros/$ROS_DISTRO /opt/ros/$ROS_DISTRO
 «ENDIF»
'''

}