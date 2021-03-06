#!/bin/bash

#mvn package to bundle the class files to a jar
#mvn assembly:single to package all the dependent jars and code jars together

for file in target/*.jar
do
	#echo "the path is $file"	
	CLASSPATH=$CLASSPATH:$file
done

#assumes that JAVA_HOME env is already set

JAVA="$JAVA_HOME/bin/java"

$JAVA -cp $CLASSPATH optionparsing $@

