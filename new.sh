#!/usr/local/bin/bash

echo Project Euler - New Solution
echo
echo Enter number:
read N
echo Enter description, and ctrl-D when done:
DESC=$(cat)
NEWSRC=src/main/java/com/example/euler/Solution`echo $N`.java
NEWTEST=src/test/java/com/example/euler/Solution`echo $N`Test.java
sed "s/DESCRIPTION/`echo $DESC`/g" src/main/java/com/example/euler/SolutionTemplate.java | sed "s/Template/`echo $N`/g" > $NEWSRC
sed "s/DESCRIPTION/`echo $DESC`/g" src/test/java/com/example/euler/SolutionTemplateTest.java | sed "s/Template/`echo $N`/g" > $NEWTEST
echo Done!
