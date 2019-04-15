#!/bin/bash

source $1
output=$((python $4 --package $2 --name $3 --node --output true) 2>&1)

echo $output
