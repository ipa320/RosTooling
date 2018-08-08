#!/bin/bash
package_name=$1

messages_fullname=$(rosmsg list | grep $package_name)
services_fullname=$(rossrv list | grep $package_name)

for i in $messages_fullname
do
    message=${i/$package_name\//}
	echo '    <spec xsi:type="ros:TopicSpec" name="'$message'"/>'
done

for i in $services_fullname
do
    service=${i/$package_name\//}
	echo '    <spec xsi:type="ros:ServiceSpec" name="'$service'"/>'
done
