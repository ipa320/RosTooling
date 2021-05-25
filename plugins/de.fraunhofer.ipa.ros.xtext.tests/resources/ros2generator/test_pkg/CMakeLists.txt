cmake_minimum_required(VERSION 3.5)
project(test_pkg)

# Default to C++14
if(NOT CMAKE_CXX_STANDARD)
  set(CMAKE_CXX_STANDARD 14)
endif()

if(CMAKE_COMPILER_IS_GNUCXX OR CMAKE_CXX_COMPILER_ID MATCHES "Clang")
  add_compile_options(-Wall -Wextra -Wpedantic)
endif()

find_package(ament_cmake REQUIRED)
find_package(Boost REQUIRED)
find_package(rclcpp REQUIRED)
find_package(std_srvs REQUIRED)
find_package(sensor_msgs REQUIRED)

add_executable(test_node src/test_node.cpp)
ament_target_dependencies(test_node rclcpp std_srvs sensor_msgs )

install(TARGETS
  test_node
  DESTINATION lib/${PROJECT_NAME})

ament_package()
