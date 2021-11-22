package de.fraunhofer.ipa.rossystem.generator

import rossystem.RosSystem
import com.google.inject.Inject
import rossystem.ComponentStack

class SetupPyCompile{
	
	@Inject extension GeneratorHelpers
	
	
		def compile_setup_py(RosSystem system,ComponentStack stack) '''«init_pkg()»
import os
from glob import glob
from setuptools import setup

PACKAGE_NAME = '«IF stack===null»«system.name.toLowerCase»«ELSE»«system.name.toLowerCase»_«stack.name.toLowerCase»«ENDIF»'

setup(
    name=PACKAGE_NAME,
    version='0.0.1',
    packages=[PACKAGE_NAME],
    data_files=[
        # Install marker file in the package index
        ('share/ament_index/resource_index/packages',
            ['resource/' + PACKAGE_NAME]),
        # Include our package.xml file
        (os.path.join('share', PACKAGE_NAME), ['package.xml']),
        # Include all launch files.
        (os.path.join('share', PACKAGE_NAME, 'launch'), glob(os.path.join('launch', '*.launch.py')))
    ],
    install_requires=['setuptools'],
    zip_safe=True
)'''
		}
