#!/usr/bin/env bash

mvn clean package -DskipTests
java -jar ./target/springboot.ss-0.0.1-SNAPSHOT.jar