if [[ "$1" == "Ex01" ]]; then
  cd Ex01
  if javac Palindrome.java; then
    java -ea Palindrome ${@:2};
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex02" ]]; then
  cd Ex02
  if javac SolveHanoi.java; then
    java -ea SolveHanoi ${@:2};
    rm *.class ./p2utils/*.class;
  fi
  cd ..
else
  echo "First argument needs to be passed!"
fi