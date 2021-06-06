import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import p2utils.SortedKeyValueList;

public class CountWords
{

  public static void main(String[] args) {
    SortedKeyValueList<Integer> counts = new SortedKeyValueList<>();

    for (int a = 0; a < args.length; a++) { // Processa cada ficheiro
      File fin = new File(args[a]);
      // Using a try-with-resources:
      try (Scanner scf = new Scanner(fin)) {
        while (scf.hasNextLine()) { // Processa cada linha
          String line = scf.nextLine();
          // Divide a linha em "palavras", considerando como separador
          // qualquer sequência de 1 ou mais carateres não alfabéticos:
          String[] palavras = line.split("[^\\p{IsAlphabetic}]+");
          // (Sobre expressões regulares usadas no split: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

          for (int i = 0; i < palavras.length; i++) { // Processa cada palavra
            if(counts.contains(palavras[i])){
              counts.set(palavras[i], counts.get(palavras[i])+1);
            }else{
              counts.set(palavras[i], 1);
            }

          }
        }
      }
      catch (Exception e) {
        err.println("ERRO: " + e.getMessage());
      }
    }
    out.println(counts.toString("Results:\n", ";\n", "\nEnd"));
    out.println(counts.toString()); // mesma lista, outro formato
    mostFrequent(counts);
  }

  // Find and print the key with most occurrences
  // and its relative frequency.
  static void mostFrequent(SortedKeyValueList<Integer> counts) {
    String[] keys = counts.keys();
    int count = 0;
    String maxkey = "";
    int maxvalue = 0;

    for (int i = 0; i < keys.length; i++) {
      int value = counts.get(keys[i]);
      count += value;
      if(maxvalue < value) {
        maxvalue = value;
        maxkey = keys[i];
      }
    }
    System.out.println("Most used word: "+maxkey+", appears "+Math.round((maxvalue*1.0/count*1.0)*100)+"%");
  }
}

