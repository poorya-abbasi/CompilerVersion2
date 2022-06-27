#!/bin/bash
./jflex/bin/jflex Lexer.flex
sed -i .old 's/public class Lexer implements sym, java_cup.runtime.Scanner {/public class Lexer extends sym implements java_cup.runtime.Scanner {/g' Lexer.java
java -jar ./java-cup-11b.jar -parser "Parser" ./Parser.cup
javac -cp .:java-cup-11b.jar Main.java
java -cp .:java-cup-11b-runtime.jar Main Program.java