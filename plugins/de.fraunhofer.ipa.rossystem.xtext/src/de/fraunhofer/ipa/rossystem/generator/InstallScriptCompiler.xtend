package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import rossystem.RosSystem

class InstallScriptCompiler {
		
	@Inject extension GeneratorHelpers
		
 def compile_toIntallScript(RosSystem system) '''«init()»
#!/bin/bash

distro=$(echo $ROS_DISTRO)

if [ -z "$distro" ]; then 
    echo "Ros distro variable not found"
    read -p "Do you want to install ROS? [Y/N]" choice
    if [[ "$choice" == "Y" ]]; then
            read -p "Distro version (e.g. kinetic, melodic): " distro
            sudo sh -c 'echo "deb http://packages.ros.org/ros/ubuntu $(lsb_release -sc) main" > /etc/apt/sources.list.d/ros-latest.list'
            sudo apt-key adv --keyserver 'hkp://keyserver.ubuntu.com:80' --recv-key C1CF6E31E6BADE8868B172B4F42ED6FBAB17C654
            sudo apt update
            sudo apt install ros-$distro-desktop
    else
        exit
    fi
else
    echo "Found a ROS installation for the $distro distro"
    sudo apt update
fi

for pkg in «FOR pkg:system.getPkgsDependencies»«pkg» «ENDFOR»
do
    sudo apt install ros-$distro-$pkg
done'''

}