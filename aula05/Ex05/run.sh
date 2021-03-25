if javac Ex05.java; then
    java -ea Ex05 $1 $2; 
    rm *.class;
fi