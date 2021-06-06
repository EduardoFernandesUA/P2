if [[ "$1" == "Ex01" ]]; then
  cd Ex01
  if javac CheckPasswd.java; then
    java -ea CheckPasswd senhas.txt;
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex02" ]]; then
  cd Ex02
  if javac CountWords.java; then
    java -ea CountWords ${@:2};
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex03" ]]; then
  cd Ex03
  if javac TranslateNumbers.java; then
    echo ${@:2} | java -ea TranslateNumbers;
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex04" ]]; then
  cd Ex04
  if javac NumberValue.java; then
    echo ${@:2} | java -ea NumberValue;
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex06" ]]; then
  cd Ex06
  if javac CountWords.java; then
    java -ea CountWords ${@:2};
    rm *.class ./p2utils/*.class;
  fi
  cd ..
else
  echo "First argument needs to be passed!"
fi