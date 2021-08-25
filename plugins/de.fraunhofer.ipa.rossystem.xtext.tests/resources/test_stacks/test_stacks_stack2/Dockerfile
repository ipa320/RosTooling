# syntax=docker/dockerfile:experimental
ARG SUFFIX=
ARG PREFIX=
FROM ros:melodic-ros-core as base
FROM ${PREFIX}builder${SUFFIX} as builder

FROM base as build
COPY . /root/ws/src/test_stacks_stack2/
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
CMD ["roslaunch", "test_stacks_stack2", "stack2.launch"]
