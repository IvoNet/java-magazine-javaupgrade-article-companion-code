# Migrate Java 1.8 to 11+

This is a repo with some examples used in the Java Magazine article I wrote for Q1 2020.

It was set up as a Maven project but I tested the stuff with different docker containers with different java versions.

# Prerequisites

* [Docker](https://docs.docker.com/install/)

# How to use

if you want to see the differences that happen when compiling with java 1.8 or e.g. java 9 or 11 the follow the 
instructions below.

```bash
git clone
```

## Java 1.8

* Open a terminal and go to this repo

```bash
docker run --rm -it --name j8 -v "$(pwd):/project" ivonet/openjdk:8 /bin/bash
```
* on docker container prompt: 

```bash
cd /project/src/main/java
javac nl/ivonet/CLASS_YOU_WANT_TO_COMPILE_HERE.java
java java nl.ivonet.CLASS_YOU_WANT_TO_COMPILE_HERE 
```

## Java 9

* Open a terminal and go to this repo

```bash
docker run --rm -it --name j9 -v "$(pwd):/project" ivonet/openjdk:9 /bin/bash
```
* on docker container prompt: 

```bash
cd /project/src/main/java
javac nl/ivonet/CLASS_YOU_WANT_TO_COMPILE_HERE.java
java java nl.ivonet.CLASS_YOU_WANT_TO_COMPILE_HERE # This will only work if the compile worked :-)
```

## Java 11

* Open a terminal and go to this repo

```bash
docker run --rm -it --name j11 -v "$(pwd):/project" ivonet/openjdk:11 /bin/bash
```
* on docker container prompt: 

```bash
cd /project/src/main/java
javac nl/ivonet/CLASS_YOU_WANT_TO_COMPILE_HERE.java
java java nl.ivonet.CLASS_YOU_WANT_TO_COMPILE_HERE # This will only work if the compile worked :-)
```







