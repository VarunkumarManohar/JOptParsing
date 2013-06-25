JOptParsing
===========
A simple PoC to push the command line arguments from a shell script to java code.
The java code uses the JOptSimple library to parse the options and notify the users if they are missing out on anything.

This approach serves as an alternative means to the traditional shell scripts parsing the arguments.

== Compiltaion

1. Use mvn package to package all the java code into a jar

2. Use mvn assembly:single to package all the dependencies [in this case JOpt library] along with the code.

=== Shell script

1. The classpath variable is created appropriately so that the java command finds the classes [custom+dependencies]
