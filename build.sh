#! /bin/bash

compile() {
    javac cisc3140lab2.java
}

run() {
    java cisc3140lab2
}

compileAndRun() {
    compile
    run
}
