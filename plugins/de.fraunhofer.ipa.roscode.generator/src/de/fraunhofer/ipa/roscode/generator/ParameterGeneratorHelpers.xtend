package de.fraunhofer.ipa.roscode.generator

import ros.impl.ParameterStringTypeImpl
import ros.impl.ParameterStringImpl
import ros.impl.ParameterIntegerTypeImpl
import ros.impl.ParameterIntegerImpl
import ros.impl.ParameterDoubleTypeImpl
import ros.impl.ParameterDoubleImpl
import ros.impl.ParameterBooleanTypeImpl
import ros.impl.ParameterBooleanImpl
import ros.impl.ParameterBase64TypeImpl
import ros.impl.ParameterBase64Impl
import ros.impl.ParameterListTypeImpl
import org.eclipse.emf.common.util.EList
import ros.ParameterType
import ros.impl.ParameterStructTypeImpl
import ros.impl.ParameterArrayTypeImpl

abstract class ParameterGeneratorHelpers {

    def String get_param_declaration_str(String param_type, String param_name, String delim, Boolean has_value)

    def Boolean is_array(EList<ParameterType> list) {
        var t = list.get(0).class
        for (type : list) {
            if (!(type.class == t)) {
                return false;
            }
        }
        return true;
    }

    def Pair<String, String> compile_struct(ParameterStructTypeImpl struct, String name) {
        var struct_str = "";
        var struct_type_str = "";
        for (elem : struct.getParameterstructypetmember()) {
            if (elem.getType() instanceof ParameterStructTypeImpl) {
                var elem_pair = compile_struct(elem.getType() as ParameterStructTypeImpl, name + "." + elem.getName());
                struct_str += elem_pair.getKey();
                struct_type_str += elem_pair.getValue();
            } else {
                var param_pair = get_param_type(elem.getType());
                var elem_name = name + "." + elem.getName();
                struct_str += get_param_declaration_str(param_pair.getKey(), elem_name, ".", (param_pair.getValue != ""));

                struct_type_str += param_pair.getKey() + " " + elem_name.replace(".", "_") + "_;\n";
            }
        }
        return new Pair<String, String>(struct_str, struct_type_str);
    }

    def Pair<String, String> get_param_type(ParameterType type) {
        var has_value = type.eContents.length > 0;
        var param_val = ""
        if (type instanceof ParameterStringTypeImpl) {
            if (has_value) {
                param_val = ", \"" + (type.eContents.get(0) as ParameterStringImpl).getValue() + "\"";
            }
            return new Pair<String, String>("std::string", param_val);
        } else if (type instanceof ParameterIntegerTypeImpl) {
            if (has_value) {
                param_val = ", " + (type.eContents.get(0) as ParameterIntegerImpl).getValue();
            }
            return new Pair<String, String>("int", param_val);
        } else if (type instanceof ParameterDoubleTypeImpl) {
            if (has_value) {
                param_val = ", " + (type.eContents.get(0) as ParameterDoubleImpl).getValue();
            }
            return new Pair<String, String>("double", param_val);
        } else if (type instanceof ParameterBooleanTypeImpl) {
            if (has_value) {
                param_val = ", " + (type.eContents.get(0) as ParameterBooleanImpl).isValue();
            }
            return new Pair<String, String>("bool", param_val);
        /*} else if (type instanceof ParameterBase64TypeImpl) {
            if (has_value) {
                param_val = ", " + (type.eContents.get(0) as ParameterBase64Impl).getValue();
            }
            return new Pair<String, String>("uint64_t", param_val); // not sure about this*/
        } else if (type instanceof ParameterListTypeImpl) {
            var list = (type as ParameterListTypeImpl).getSequence();
            if (!list.is_array()) {
                return new Pair<String, String>("", "");
            }
            var list_type = get_param_type(list.get(0));
            return new Pair<String, String>("std::vector<" + list_type.getKey() + ">", "");
        } else if (type instanceof ParameterArrayTypeImpl) {
            var array = type as ParameterArrayTypeImpl;
            return new Pair<String, String>("std::vector<" + get_param_type(array.getType()).getKey() + ">", "");
        }

        return new Pair<String, String>("", "");
     }

}
