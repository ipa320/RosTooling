#!/bin/bash
package_list=$@

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
        msg_desc=""
        for word in $message_show; do

            if [[ $word == *"/"* ]]; then
                ref="$(echo $word | tr / .)"
                msg_desc+='"'$ref'"'
            else
                msg_desc+=" "$word" "
            fi
        final_desc="$(echo $msg_desc)"       
        done
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
	    echo -n '      ServiceSpec '$service'{}'
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
