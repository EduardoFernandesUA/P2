import static java.lang.System.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import p2utils.LinkedList;

import java.io.IOException;

import static p2utils.Sorting.*;

public class GetWords
{
  public static void main(String[] args) {
    if (args.length < 1) {
      err.println("Usage: java GetWords <files>");
      exit(1);
    }

    LinkedList<String> list = new LinkedList<>();

    for (int i = 0; i < args.length; i++) {
      File fin = new File(args[i]);
      extractWords(list,fin);
    }

    // converter a lista em array para a poder ordenar
    String[] words = new String[list.size()];
    for (int i = 0; !list.isEmpty(); i++) {
      words[i] = list.first();
      list.removeFirst();
    }
    mergeSort(words, 0, words.length);

    // print and write to file
    try{
      FileWriter outFile = new FileWriter("words.txt"); 
      for(int i = 0; i < words.length; i++){
        out.printf("[%05d] %s\n", i+1, words[i]);
        outFile.write(words[i]+"\n");
      }
      outFile.close();
    } catch(IOException e) {
      System.out.println("Exception "+e);
      exit(1);
    }
    
  }


  // Read words from a file, return words in an array
  static void extractWords(LinkedList<String> list, File fin) {
    try {
      // count the words
      int n = 0;
      Scanner scf = new Scanner(fin).useDelimiter("[\\p{Punct}\\p{Space}]+");
      // (words are delimited by 1 or more punctuation or whitespace char)
      while (scf.hasNext()) {
        scf.next();
        n++;
      }
      scf.close();

      // create the array
      //String[] result = new String[n];

      // read the words
      int i = 0;
      scf = new Scanner(fin).useDelimiter("[\\p{Punct}\\p{Space}]+");
      while (scf.hasNext()) {
        String word = scf.next();
        if(!list.contains(word)){
          list.addLast(word);
        }
        i++;
      }
      scf.close();
    }
    catch (IOException e) {
      err.printf("Error: %s\n", e);
      exit(1);
      return;  // never happens...
    }
  }

}
