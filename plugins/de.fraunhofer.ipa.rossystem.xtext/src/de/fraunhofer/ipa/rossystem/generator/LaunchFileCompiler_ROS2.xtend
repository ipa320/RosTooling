package de.fraunhofer.ipa.rossystem.generator

import com.google.inject.Inject
import componentInterface.ComponentInterface
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import ros.ParameterValue
import rossystem.RosSystem

class LaunchFileCompiler_ROS2 {
	@Inject extension GeneratorHelpers
	@Inject extension ComponentInterfaceCompiler

	List<String> ListInterfaceDef
	ParameterValue ParamValue
	String str_output=""
	String tab_tmp=""	
	List<Integer> sizes_list = new ArrayList<Integer>();
	List<EObject> param_list = new ArrayList<EObject>();
	
	int i=0;
	int k=0;

	def compile_toROS2launch(RosSystem system) '''«init_comp()»
from launch import LaunchDescription
from launch_ros.actions import Node

def generate_launch_description():
	ld = LaunchDescription()

	«FOR component:system.rosComponent»
	«component.name» = Node(
		package="«component.compile_pkg»«init_pkg»",
		executable="«component.compile_art»«init_comp()»"
	)
	«ENDFOR»

	«FOR component:system.rosComponent»
	ld.add_action(«component.name»)
	«ENDFOR»

	return ld
	'''

	def check_ns(ComponentInterface component){
		if (component.hasNS){
			return component.get_ns();
		}else {
			return "";
		}
	}

	def String compile_struct_param(List<EObject> paramMembers,Boolean sub){
		if (!sub){
			sizes_list.add(paramMembers.size);
		} 
		for (paramMember: paramMembers ){
			if (paramMember.eClass.name=='ParameterStruct'){
				for (SubParamMember:paramMember.eContents){				
					tab_tmp="  ";//rosparam has to start with a first indentation as offset - fix
					for(i=1;i<sizes_list.size;i++){
						tab_tmp+="  ";
					}
					str_output+=tab_tmp+getParamName(SubParamMember.toString)+": \n";
					param_list.clear;
					param_list.add(SubParamMember);
					compile_struct_param(param_list,true);
	    		}
			} else {
				// FOR LIST
				if (paramMember.eContents.get(0).eClass.name=="ParameterSequence"){
					if(paramMember.eContents.get(0).eContents.get(0).eClass.name!=="ParameterStruct"){
						str_output=str_output.substring(0, str_output.length() - 1);
						str_output+="[";
						for (seq_member:paramMember.eContents.get(0).eContents){
							str_output+=compile_param_value(convertParamValue(seq_member))+",";
						}
						str_output = str_output.substring(0, str_output.length() - 1)+"]"+"\n";							
					} else {
						sizes_list.add(paramMember.eContents.get(0).eContents.size);
						for (seq_member:paramMember.eContents.get(0).eContents){
							param_list.clear;
							param_list.add(seq_member);
							compile_struct_param(param_list,true);
							k=sizes_list.get(sizes_list.size-1);
							k--;
							sizes_list.remove(sizes_list.size() - 1);
							if (k>0){
								sizes_list.add(k);
							}
						}
					}
				//FOR PRIMITIVES: STRING, INT, ...
				} else {
					str_output=str_output.substring(0, str_output.length() - 1);
					str_output+=compile_param_value(convertParamValue(paramMember.eContents.get(0)))+"\n";
				}
			}
			if (!sub){
				k=sizes_list.get(sizes_list.size-1);
				k--;				
				sizes_list.remove(sizes_list.size() - 1);
				if (k>0){
					sizes_list.add(k);
				}
			}
		}
		if (sizes_list.isEmpty){
			return str_output.replace("null","");
		}
	}

	def List<String> InterfaceDef(String name, String type){
		ListInterfaceDef = new ArrayList()
		ListInterfaceDef.add(name.replace("/","_"))
		ListInterfaceDef.add(name)
		ListInterfaceDef.add(type)
		return ListInterfaceDef
	}

	def boolean hasNS(ComponentInterface component){
		if(!component.nameSpace.nullOrEmpty){
			return true;
		}else{
			return false
		}
	}
	def String get_ns(ComponentInterface component){
		return component.nameSpace.replaceFirst("/","");
	}

 	def getParamName (String paramdef){
 		return paramdef.substring(paramdef.indexOf("name:")+6,paramdef.indexOf(")"))
 	}
 	
	def convertParamValue (Object ParamMember){
		ParamValue=ParamMember as ParameterValue
		return ParamValue
	}
}
