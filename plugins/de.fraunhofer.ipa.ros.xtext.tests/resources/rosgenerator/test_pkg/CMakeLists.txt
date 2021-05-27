cmake_minimum_required(VERSION 3.0.2)
project(test_pkg)

find_package(catkin REQUIRED COMPONENTS roscpp std_srvs sensor_msgs )

catkin_package(
  CATKIN_DEPENDS roscpp std_srvs sensor_msgs 
)

### Build ###

include_directories(${catkin_INCLUDE_DIRS})

add_executable(test_node src/test_node.cpp)
add_dependencies(test_node ${catkin_EXPORTED_TARGETS})
target_link_libraries(test_node ${catkin_LIBRARIES})

### Install ###
install(TARGETS test_node
  ARCHIVE DESTINATION ${CATKIN_PACKAGE_LIB_DESTINATION}
  LIBRARY DESTINATION ${CATKIN_PACKAGE_LIB_DESTINATION}
  RUNTIME DESTINATION ${CATKIN_PACKAGE_BIN_DESTINATION}
)
