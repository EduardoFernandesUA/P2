if [[ "$1" == "Ex01" ]]; then
  cd Ex01
  if javac TestMergeSort.java; then
    echo 4 3 2 6 1 2 3 5 7 8 9 5 | java -ea TestMergeSort; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex02" ]]; then
  cd Ex02
  if javac TestInsertionSort.java; then
    echo 4 3 2 6 1 2 3 5 7 8 9 5 | java -ea TestInsertionSort; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex03" ]]; then
  cd Ex03
  if javac TestSorting.java; then
    java -ea TestSorting ${@:2}; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex04" ]]; then
  cd Ex04
  if javac TestGenericSort.java; then
    java -ea TestGenericSort maria joao ana tomas antonio; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex05" ]]; then
  cd Ex05
  if javac ListSort.java; then
    java -ea ListSort numbers.txt data.txt; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex06" ]]; then
  cd Ex06
  if javac GetWords.java; then
    java -ea GetWords data.txt; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
elif [[ "$1" == "Ex07" ]]; then
  cd Ex07
  if javac GetWords.java; then
    java -ea GetWords words.txt data.txt; 
    rm *.class ./p2utils/*.class;
  fi
  cd ..
else
  echo "First argument needs to be passed!"
fi