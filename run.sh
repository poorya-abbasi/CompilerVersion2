#!/bin/bash
java -jar ./java-cup-11b.jar -parser "Parser" ./Parser.cup
javac -cp .:java-cup-11b.jar Main.java
java -cp .:java-cup-11b-runtime.jar Main Program.java