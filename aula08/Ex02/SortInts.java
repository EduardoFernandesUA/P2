import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortInts
{
  public static void main(String[] args) throws IOException {
    SortedListInt list = new SortedListInt();

    for (int i = 0; i < args.length; i++) {
      File file = new File(args[i]);
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        String data = sc.nextLine();
        try{
          int n = Integer.parseInt(data);
          list.insert(n);
        } catch(NumberFormatException e) {
          // ignora
        }

      }
      sc.close();
    }

    while(!list.isEmpty()) {
      out.println(list.first());
      list.removeFirst();
    }
  }

}


