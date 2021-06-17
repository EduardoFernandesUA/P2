if [[ "$1" == "Ex01" ]]; then
  cd Ex01
  if javac TestHashTable.java; then
    java -ea TestHashTable;
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex02" ]]; then
  cd Ex02
  if javac TestSupermarket.java; then
    java -ea TestSupermarket;
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex03" ]]; then
  cd Ex03
  if javac CountBigrams.java; then
    java -ea CountBigrams ${@:2};
    rm *.class ./p2utils/*.class;
  fi
  cd ..
else
  echo "First argument needs to be passed!"
fi
