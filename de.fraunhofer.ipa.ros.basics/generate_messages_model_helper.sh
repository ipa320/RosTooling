#!/bin/bash
package_name=$1

messages_fullname=$(rosmsg list | grep $package_name)
services_fullname=$(rossrv list | grep $package_name)

echo '<?xml version="1.0" encoding="UTF-8"?>'
echo '<ros:Package xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:ros="http://www.example.org/ros" name="'$package_name'">'

for i in $messages_fullname
do
    message=${i/$package_name\//}
	echo '  <message name="'$message'"/>'
done

for i in $services_fullname
do
    service=${i/$package_name\//}
	echo '  <service name="'$service'"/>'
done

echo '</ros:Package>'
