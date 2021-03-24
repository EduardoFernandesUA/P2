if javac CopyFile.java; then
    java -ea CopyFile $1 $2; 
    rm *.class;
fi