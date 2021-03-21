# chmod +x ./run.sh
javac PlayGuessGame.java && (java -ea PlayGuessGame $1 $2; rm *.class)