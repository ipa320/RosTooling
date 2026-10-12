package de.fraunhofer.ipa.ros2.generator

import ros.Artifact
import ros.Node
import ros.Package
import ros.Publisher
import ros.Subscriber
import ros.ServiceServer
import ros.ServiceClient
import ros.ActionServer
import ros.ActionClient
import ros.Parameter
import ros.ParameterType
import ros.ParameterValue
import ros.TopicSpec
import ros.ServiceSpec
import ros.ActionSpec
import ros.QualityOfService
import ros.impl.ParameterStringTypeImpl
import ros.impl.ParameterStringImpl
import ros.impl.ParameterIntegerTypeImpl
import ros.impl.ParameterIntegerImpl
import ros.impl.ParameterDoubleTypeImpl
import ros.impl.ParameterDoubleImpl
import ros.impl.ParameterBooleanTypeImpl
import ros.impl.ParameterBooleanImpl
import ros.impl.ParameterArrayTypeImpl
import ros.impl.ParameterSequenceImpl
import ros.impl.ParameterStructTypeImpl
import java.util.Set
import java.util.HashSet
import java.util.List
import java.util.ArrayList
import ros.ParameterBooleanType
import ros.ParameterIntegerType
import ros.ParameterStringType
import ros.ParameterDoubleType
import ros.ParameterArrayType
import ros.ParameterListType
import ros.ParameterDateType
import ros.ParameterBase64Type
import ros.ParameterAnyType

class Ros2GeneratorHelpers {

    def String toSnakeCase(String str) {
        if (str === null || str.empty) return ""
        val result = new StringBuilder()
        val chars = str.toCharArray()
        for (var i = 0; i < chars.length; i++) {
            val c = chars.get(i)
            if (Character.isUpperCase(c)) {
                if (i > 0 && chars.get(i - 1) != '_' && (!Character.isUpperCase(chars.get(i - 1)) || (i + 1 < chars.length && Character.isLowerCase(chars.get(i + 1))))) {
                    result.append('_')
                }
                result.append(Character.toLowerCase(c))
            } else if (c == '/' || c == '-' || c == '~' || c == '.') {
                result.append('_')
            } else {
                result.append(c)
            }
        }
        var s = result.toString()
        while (s.startsWith("_")) {
            s = s.substring(1)
        }
        return s
    }

    def String sanitizeName(String name) {
        if (name === null) return ""
        var s = name.replace("/", "_").replace("~", "").replace("-", "_").replace(".", "_").replace(" ", "_")
        while (s.startsWith("_")) {
            s = s.substring(1)
        }
        return s
    }

    def String toCamelCase(String str) {
        if (str === null || str.empty) return ""
        val parts = str.split("[_\\-/]")
        val result = new StringBuilder()
        for (part : parts) {
            if (!part.empty) {
                result.append(Character.toUpperCase(part.charAt(0)))
                if (part.length > 1) {
                    result.append(part.substring(1))
                }
            }
        }
        return result.toString()
    }

    def String getArtifactName(Node node) {
        if (node !== null && node.eContainer instanceof Artifact) {
            val art = node.eContainer as Artifact
            if (art.name !== null && !art.name.trim.empty) {
                return art.name.trim
            }
        }
        return if (node !== null && node.name !== null) node.name else "node"
    }

    def String getSpecPackage(TopicSpec spec) {
        if (spec === null) return "std_msgs"
        if (spec.package !== null && !spec.package.name.nullOrEmpty) {
            return spec.package.name
        }
        if (spec.name !== null && spec.name.contains("/")) {
            return spec.name.split("/").get(0)
        }
        return "std_msgs"
    }

    def String getSpecName(TopicSpec spec) {
        if (spec === null) return "String"
        if (spec.name !== null && spec.name.contains("/")) {
            val parts = spec.name.split("/")
            val last = parts.get(parts.length - 1)
            if (!last.nullOrEmpty) return last
        }
        if (spec.name !== null && !spec.name.trim.empty) {
            return spec.name.trim
        }
        return "String"
    }

    def String getSpecPackage(ServiceSpec spec) {
        if (spec === null) return "std_srvs"
        if (spec.package !== null && !spec.package.name.nullOrEmpty) {
            return spec.package.name
        }
        if (spec.name !== null && spec.name.contains("/")) {
            return spec.name.split("/").get(0)
        }
        return "std_srvs"
    }

    def String getSpecName(ServiceSpec spec) {
        if (spec === null) return "SetBool"
        if (spec.name !== null && spec.name.contains("/")) {
            val parts = spec.name.split("/")
            val last = parts.get(parts.length - 1)
            if (!last.nullOrEmpty) return last
        }
        if (spec.name !== null && !spec.name.trim.empty) {
            return spec.name.trim
        }
        return "SetBool"
    }

    def String getSpecPackage(ActionSpec spec) {
        if (spec === null) return "example_interfaces"
        if (spec.package !== null && !spec.package.name.nullOrEmpty) {
            return spec.package.name
        }
        if (spec.name !== null && spec.name.contains("/")) {
            return spec.name.split("/").get(0)
        }
        return "example_interfaces"
    }

    def String getSpecName(ActionSpec spec) {
        if (spec === null) return "Fibonacci"
        if (spec.name !== null && spec.name.contains("/")) {
            val parts = spec.name.split("/")
            val last = parts.get(parts.length - 1)
            if (!last.nullOrEmpty) return last
        }
        if (spec.name !== null && !spec.name.trim.empty) {
            return spec.name.trim
        }
        return "Fibonacci"
    }

    def String getCppType(ParameterType type) {
        if (type instanceof ParameterStringTypeImpl) {
            return "std::string"
        } else if (type instanceof ParameterIntegerTypeImpl) {
            return "int64_t"
        } else if (type instanceof ParameterDoubleTypeImpl) {
            return "double"
        } else if (type instanceof ParameterBooleanTypeImpl) {
            return "bool"
        } else if (type instanceof ParameterArrayTypeImpl) {
            val inner = (type as ParameterArrayTypeImpl).type
            return "std::vector<" + getCppType(inner) + ">"
        }
        return "std::string"
    }

    def String getPythonType(ParameterType type) {
        if (type instanceof ParameterStringTypeImpl) {
            return "str"
        } else if (type instanceof ParameterIntegerTypeImpl) {
            return "int"
        } else if (type instanceof ParameterDoubleTypeImpl) {
            return "float"
        } else if (type instanceof ParameterBooleanTypeImpl) {
            return "bool"
        } else if (type instanceof ParameterArrayTypeImpl) {
            val inner = (type as ParameterArrayTypeImpl).type
            return "List[" + getPythonType(inner) + "]"
        }
        return "str"
    }

    def String getRos2ParamTypeEnumCpp(ParameterType type) {
        if (type instanceof ParameterStringTypeImpl) {
            return "rclcpp::ParameterType::PARAMETER_STRING"
        } else if (type instanceof ParameterIntegerTypeImpl) {
            return "rclcpp::ParameterType::PARAMETER_INTEGER"
        } else if (type instanceof ParameterDoubleTypeImpl) {
            return "rclcpp::ParameterType::PARAMETER_DOUBLE"
        } else if (type instanceof ParameterBooleanTypeImpl) {
            return "rclcpp::ParameterType::PARAMETER_BOOL"
        } else if (type instanceof ParameterArrayTypeImpl) {
            val inner = (type as ParameterArrayTypeImpl).type
            if (inner instanceof ParameterStringTypeImpl) return "rclcpp::ParameterType::PARAMETER_STRING_ARRAY"
            if (inner instanceof ParameterIntegerTypeImpl) return "rclcpp::ParameterType::PARAMETER_INTEGER_ARRAY"
            if (inner instanceof ParameterDoubleTypeImpl) return "rclcpp::ParameterType::PARAMETER_DOUBLE_ARRAY"
            if (inner instanceof ParameterBooleanTypeImpl) return "rclcpp::ParameterType::PARAMETER_BOOL_ARRAY"
        }
        return "rclcpp::ParameterType::PARAMETER_NOT_SET"
    }

    def String getRos2ParamTypeEnumPython(ParameterType type) {
        if (type instanceof ParameterStringTypeImpl) {
            return "rclpy.Parameter.Type.STRING"
        } else if (type instanceof ParameterIntegerTypeImpl) {
            return "rclpy.Parameter.Type.INTEGER"
        } else if (type instanceof ParameterDoubleTypeImpl) {
            return "rclpy.Parameter.Type.DOUBLE"
        } else if (type instanceof ParameterBooleanTypeImpl) {
            return "rclpy.Parameter.Type.BOOL"
        } else if (type instanceof ParameterArrayTypeImpl) {
            val inner = (type as ParameterArrayTypeImpl).type
            if (inner instanceof ParameterStringTypeImpl) return "rclpy.Parameter.Type.STRING_ARRAY"
            if (inner instanceof ParameterIntegerTypeImpl) return "rclpy.Parameter.Type.INTEGER_ARRAY"
            if (inner instanceof ParameterDoubleTypeImpl) return "rclpy.Parameter.Type.DOUBLE_ARRAY"
            if (inner instanceof ParameterBooleanTypeImpl) return "rclpy.Parameter.Type.BOOL_ARRAY"
        }
        return "rclpy.Parameter.Type.NOT_SET"
    }

    def String getParamDefaultValueCpp(Parameter param) {
        val valObj = getEffectiveParameterValue(param)
        if (valObj === null) return null
        val pType = param.type
        if (valObj instanceof ParameterStringImpl) {
            val s = (valObj as ParameterStringImpl).value
            if (pType instanceof ParameterBooleanTypeImpl) {
                return if ("true".equalsIgnoreCase(s)) "true" else "false"
            } else if (pType instanceof ParameterIntegerTypeImpl) {
                return s
            } else if (pType instanceof ParameterDoubleTypeImpl) {
                return if (s.contains(".")) s else s + ".0"
            } else if (pType instanceof ParameterArrayTypeImpl) {
                var cleaned = s.trim
                if (cleaned.startsWith("[") && cleaned.endsWith("]")) {
                    cleaned = cleaned.substring(1, cleaned.length - 1)
                }
                val parts = cleaned.split(",")
                val items = new ArrayList<String>()
                for (p : parts) {
                    val trimmed = p.trim.replaceAll("^['\"]|['\"]$", "")
                    if (!trimmed.empty) {
                        items.add('"' + trimmed + '"')
                    }
                }
                return "{" + items.join(", ") + "}"
            }
            return '"' + s + '"'
        } else if (valObj instanceof ParameterIntegerImpl) {
            return (valObj as ParameterIntegerImpl).value.toString()
        } else if (valObj instanceof ParameterDoubleImpl) {
            var d = (valObj as ParameterDoubleImpl).value.toString()
            if (!d.contains(".")) d = d + ".0"
            return d
        } else if (valObj instanceof ParameterBooleanImpl) {
            return (valObj as ParameterBooleanImpl).value ? "true" : "false"
        } else if (valObj instanceof ParameterSequenceImpl) {
            val seq = (valObj as ParameterSequenceImpl).value
            val items = new ArrayList<String>()
            for (item : seq) {
                if (item instanceof ParameterStringImpl) items.add('"' + item.value + '"')
                else if (item instanceof ParameterIntegerImpl) items.add(item.value.toString())
                else if (item instanceof ParameterDoubleImpl) items.add(item.value.toString())
                else if (item instanceof ParameterBooleanImpl) items.add(item.value ? "true" : "false")
            }
            return "{" + items.join(", ") + "}"
        }
        return null
    }

    def String getParamDefaultValuePython(Parameter param) {
        val valObj = getEffectiveParameterValue(param)
        if (valObj === null) return null
        val pType = param.type
        if (valObj instanceof ParameterStringImpl) {
            val s = (valObj as ParameterStringImpl).value
            if (pType instanceof ParameterBooleanTypeImpl) {
                return if ("true".equalsIgnoreCase(s)) "True" else "False"
            } else if (pType instanceof ParameterIntegerTypeImpl) {
                return s
            } else if (pType instanceof ParameterDoubleTypeImpl) {
                return if (s.contains(".")) s else s + ".0"
            } else if (pType instanceof ParameterArrayTypeImpl) {
                var cleaned = s.trim
                if (cleaned.startsWith("[") && cleaned.endsWith("]")) {
                    cleaned = cleaned.substring(1, cleaned.length - 1)
                }
                val parts = cleaned.split(",")
                val items = new ArrayList<String>()
                for (p : parts) {
                    val trimmed = p.trim.replaceAll("^['\"]|['\"]$", "")
                    if (!trimmed.empty) {
                        items.add("'" + trimmed + "'")
                    }
                }
                return "[" + items.join(", ") + "]"
            }
            return "'" + s + "'"
        } else if (valObj instanceof ParameterIntegerImpl) {
            return (valObj as ParameterIntegerImpl).value.toString()
        } else if (valObj instanceof ParameterDoubleImpl) {
            var d = (valObj as ParameterDoubleImpl).value.toString()
            if (!d.contains(".")) d = d + ".0"
            return d
        } else if (valObj instanceof ParameterBooleanImpl) {
            return (valObj as ParameterBooleanImpl).value ? "True" : "False"
        } else if (valObj instanceof ParameterSequenceImpl) {
            val seq = (valObj as ParameterSequenceImpl).value
            val items = new ArrayList<String>()
            for (item : seq) {
                if (item instanceof ParameterStringImpl) items.add("'" + item.value + "'")
                else if (item instanceof ParameterIntegerImpl) items.add(item.value.toString())
                else if (item instanceof ParameterDoubleImpl) items.add(item.value.toString())
                else if (item instanceof ParameterBooleanImpl) items.add(item.value ? "True" : "False")
            }
            return "[" + items.join(", ") + "]"
        }
        return null
    }

    def String getQosCpp(QualityOfService qos) {
        if (qos === null) return "rclcpp::SystemDefaultsQoS()"
        if ("sensor_qos".equals(qos.getQoSProfile())) return "rclcpp::SensorDataQoS()"
        if ("services_qos".equals(qos.getQoSProfile())) return "rclcpp::ServicesQoS()"
        if ("parameter_qos".equals(qos.getQoSProfile())) return "rclcpp::ParametersQoS()"
        
        val depth = if (qos.depth > 0) qos.depth else 10
        var qosStr = "rclcpp::QoS(" + depth + ")"
        if ("best_effort".equals(qos.reliability)) {
            qosStr += ".best_effort()"
        } else if ("reliable".equals(qos.reliability)) {
            qosStr += ".reliable()"
        }
        if ("transient_local".equals(qos.durability)) {
            qosStr += ".transient_local()"
        } else if ("volatile".equals(qos.durability)) {
            qosStr += ".durability_volatile()"
        }
        return qosStr
    }

    def String getQosPython(QualityOfService qos) {
        if (qos === null) return "rclpy.qos.qos_profile_system_default"
        if ("sensor_qos".equals(qos.getQoSProfile())) return "rclpy.qos.qos_profile_sensor_data"
        if ("services_qos".equals(qos.getQoSProfile())) return "rclpy.qos.qos_profile_services_default"
        if ("parameter_qos".equals(qos.getQoSProfile())) return "rclpy.qos.qos_profile_parameters"
        
        val depth = if (qos.depth > 0) qos.depth else 10
        var reliability = "ReliabilityPolicy.RELIABLE"
        if ("best_effort".equals(qos.reliability)) {
            reliability = "ReliabilityPolicy.BEST_EFFORT"
        }
        var durability = "DurabilityPolicy.VOLATILE"
        if ("transient_local".equals(qos.durability)) {
            durability = "DurabilityPolicy.TRANSIENT_LOCAL"
        }
        return "QoSProfile(depth=" + depth + ", reliability=" + reliability + ", durability=" + durability + ")"
    }

    def Set<String> getDependencies(Node node) {
        val set = new HashSet<String>()
        if (node === null) return set
        for (pub : node.publisher) {
            set.add(pub.message.specPackage)
        }
        for (sub : node.subscriber) {
            set.add(sub.message.specPackage)
        }
        for (srv : node.serviceserver) {
            set.add(srv.service.specPackage)
        }
        for (client : node.serviceclient) {
            set.add(client.service.specPackage)
        }
        for (act : node.actionserver) {
            set.add(act.action.specPackage)
        }
        for (actClient : node.actionclient) {
            set.add(actClient.action.specPackage)
        }
        return set
    }

    def boolean hasActions(Node node) {
        return (node.actionserver !== null && !node.actionserver.empty) || 
               (node.actionclient !== null && !node.actionclient.empty)
    }

    def boolean hasActionServer(Node node) {
        return node.actionserver !== null && !node.actionserver.empty
    }

    def boolean hasActionClient(Node node) {
        return node.actionclient !== null && !node.actionclient.empty
    }

    def boolean hasServiceClients(Node node) {
        return node.serviceclient !== null && !node.serviceclient.empty
    }
    
    def ParameterValue getEffectiveParameterValue(Parameter param) {
        if (param.value !== null) {
            return param.value
        }
        
        val t = param.type
        switch(t) {
          ParameterBooleanType: t.getDefault()
          ParameterIntegerType: t.getDefault()
          ParameterStringType: t.getDefault()
          ParameterDoubleType: t.getDefault()
          ParameterArrayType: t.getDefault()
          ParameterListType: t.getDefault()
          ParameterDateType: t.getDefault()
          ParameterBase64Type: t.getDefault()
          ParameterAnyType: t.getDefault()
          default: null
        }
    }

    def boolean isLifecycle(Node node) {
        return node !== null && node.isIsLifecycle
    }

    def boolean hasLifecycle(List<Node> nodes) {
        if (nodes === null) return false
        for (node : nodes) {
            if (node.isLifecycle) return true
        }
        return false
    }

    def boolean isPubActiveIn(Publisher pub, String stateName) {
        if (pub === null) return false
        if (pub.activeStates === null || pub.activeStates.empty) {
            return "ACTIVE".equalsIgnoreCase(stateName)
        }
        return pub.activeStates.exists[literal.equalsIgnoreCase(stateName) || getName().equalsIgnoreCase(stateName)]
    }
}
