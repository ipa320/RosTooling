#/bin/bash
source /root/haros/devel/setup.bash
cd /root/haros/src/
git clone $1

rosdep install -y -i -r --from-path /root/haros/src
cd /root/haros
catkin_make

python /ros_model_extractor.py --package $2 --name $3 --node --output true >> /root/$3.ros
python /web_test.py $3 /root/$3.ros 
