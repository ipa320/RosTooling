cmake_minimum_required(VERSION 2.8.3)
project(test_stacks_stack2)

find_package(catkin REQUIRED)

catkin_package()


### INSTALL ###
install(DIRECTORY launch
  DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}
)