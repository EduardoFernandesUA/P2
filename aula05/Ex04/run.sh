if javac Ex04.java; then
    java -ea Ex04 $1 $2; 
    rm *.class;
fi