#!/bin/bash
javac -cp .:java-cup-11b.jar Main.java
java -cp .:java-cup-11b-runtime.jar Main Program.java