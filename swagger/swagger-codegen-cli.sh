#!/bin/sh

CODE_GEN_VERSION="2.1.5"
JAR_FILE=swagger-codegen-cli-${CODE_GEN_VERSION}.jar

mkdir -p lib
if [ ! -e lib/${JAR_FILE} ]
then
  wget http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/${CODE_GEN_VERSION}/${JAR_FILE} -O lib/${JAR_FILE}
fi

java -jar lib/${JAR_FILE} generate \
  -i http://localhost:8080/v2/api-docs \
  -l java \
  -o out/java

java -jar lib/${JAR_FILE} generate \
  -i http://localhost:8080/v2/api-docs \
  -l typescript-angular \
  -o out/typescript-angular

java -jar lib/${JAR_FILE} generate \
  -i http://localhost:8080/v2/api-docs \
  -l typescript-node \
  -o out/typescript-node

