#!/bin/bash
package_list=$@


function parserToRosModel(){    
    msg_desc=""
    for word in $1; do
        word="$(echo $word | sed -e 's/\[[^][]*\]/[]/g' )"
        if [[ $word == *"/"* ]]; then
            ref="$(echo $word | tr / .)"
            if [[ $ref = *"[]"* ]]; then
                msg_desc+='"'${ref%"[]"}'"[]'
            else
                msg_desc+='"'$ref'"'
            fi
        else
            msg_desc+=" "$word" "
        fi
    done
    echo $msg_desc
}

echo 'PackageSet{package{'
arr_pkg=($package_list)
cout_pkg=${#arr_pkg[@]}

for p in $package_list
do
    cout_pkg=$((cout_pkg-1))
    messages_fullname=$(rosmsg package $p)
    arr_msg=($messages_fullname)
    cout_msg=${#arr_msg[@]}
    services_fullname=$(rossrv package $p)
    arr_srv=($services_fullname)
    cout_srv=${#arr_srv[@]}

    echo '    Package '$p'{ spec { '

    for i in $messages_fullname
    do
        cout_msg=$((cout_msg-1))
        message=${i/$p\//}
        message_show=$(rosmsg show -r $i | sed '/^#/ d' | awk -F'#' '{print $1}')
        message_show="$(echo $message_show | sed -e 's/\s=\s/=/g')"
        final_desc=$(parserToRosModel "$message_show")
	    echo -n '      TopicSpec '$message'{ message { '$final_desc' }}'
        if (("$cout_msg" >= "1" || "$cout_srv" >= "1" ))
        then
            echo ','
        fi
    done

    for i in $services_fullname
    do
        cout_srv=$((cout_srv-1))
        service=${i/$p\//}
        service_show=$(rossrv show -r $i | sed '/^#/ d' | awk -F'#' '{print $1}')
        request="$(echo $service_show | sed 's/---.*//' | sed -e 's/\s=\s/=/g')"
        response="$(echo $service_show | sed -e 's#.*---\(\)#\1#'| sed -e 's/\s=\s/=/g')"
        final_request=$(parserToRosModel "$request")
        final_response=$(parserToRosModel "$response")   
	    echo -n '      ServiceSpec '$service'{ request { '$final_request' } response { '$final_response' } }'
        if (("$cout_srv" >= "1"))
        then
            echo ','
        fi
    done
    echo -n $'\n    }}'
    if (("$cout_pkg" >= "1"))
    then
        echo ','
    fi
done

echo $'\n  }'
echo '}'

