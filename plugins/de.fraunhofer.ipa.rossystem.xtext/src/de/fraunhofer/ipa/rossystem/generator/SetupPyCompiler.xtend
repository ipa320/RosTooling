package de.fraunhofer.ipa.rossystem.generator

import rossystem.RosSystem
import com.google.inject.Inject

class SetupPyCompile{
	
	@Inject extension GeneratorHelpers
	
	
		def compile_setup_py(RosSystem system) '''«init_pkg()»
from setuptools import setup

PACKAGE_NAME = '«system.name.toLowerCase»'

setup(
    name=PACKAGE_NAME,
    version='0.0.1',
    packages=[PACKAGE_NAME],
    data_files=[
        ('share/' + PACKAGE_NAME + '/launch/*.launch.py')
    ],
    install_requires=['setuptools'],
    zip_safe=True
)'''
		}
