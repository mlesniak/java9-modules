# Overview

This repository shows a small example of handling Java 9 modules (Jigsaw). The corresponding slides can be found [here](http://slides.com/mlesniak/java-9-module).

## Build and run

    cd core
    mvn clean install
    cd ..
    cd application
    mvn clean install
    cd ..
    java -p $(find . -name \*.jar|paste -s -d":" -) -m application/com.mlesniak.application.Main