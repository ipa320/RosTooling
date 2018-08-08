#!/bin/bash
package_list=$@

echo '<?xml version="1.0" encoding="UTF-8"?>'
echo '<ros:PackageSet  xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ros="http://www.example.org/ros">'

for p in $package_list
do
    messages_fullname=$(rosmsg list | grep $p)
    services_fullname=$(rossrv list | grep $p)
    echo '  <package name="'$p'">'
    for i in $messages_fullname
    do
        message=${i/$p\//}
	    echo '    <spec xsi:type="ros:TopicSpec" name="'$message'"/>'
    done

    for i in $services_fullname
    do
        service=${i/$p\//}
	    echo '    <spec xsi:type="ros:ServiceSpec" name="'$service'"/>'
    done
    echo '  </package>'
done

echo '</ros:PackageSet>'
