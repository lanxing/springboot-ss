#!/usr/bin/env bash

mvn clean package -DskipTests
mvn spring-boot:run