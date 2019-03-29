# Use the docker container to obtain the model of a Ros existing node

Install docker https://docs.docker.com/install/linux/docker-ce/ubuntu/


Build the HAROS docker image (only once):
```
cd path-to-ros-model/tools/docker/
sudo docker build --tag=haros .
```

Run the docker extractor script givig as argument the url of the GitHub repository that holds the source code, the name of the ROS package that contains the node and the name of the node to be analysed:
```
sudo docker run -p 4000:80 -ti haros:latest /haros_runner.sh *Repo_URL* *package_name* *node_name*
```

For example:
```
sudo docker run -p 4000:80 -ti haros:latest /haros_runner.sh https://github.com/ros/ros_tutorials/ turtlesim turtlesim_node
```

Open on your browser the page: http://localhost:4000/
