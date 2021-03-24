if javac PlayGuessGame.java; then
    java -ea PlayGuessGame $1 $2; 
    rm *.class;
fi