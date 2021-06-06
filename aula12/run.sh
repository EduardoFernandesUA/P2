if [[ "$1" == "Ex01" ]]; then
  cd Ex01
  if javac TestHashTable.java; then
    java -ea TestHashTable;
    rm *.class ./p2utils/*.class;
  fi
  cd ..
else
  echo "First argument needs to be passed!"
fi