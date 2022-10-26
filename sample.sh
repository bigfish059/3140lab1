#! /bin/bash

source ./build.sh

echo "using build.sh"
compileAndRun

echo "using bash script"
chmod +x cisc3140lab2.sh
./cisc3140lab2.sh
