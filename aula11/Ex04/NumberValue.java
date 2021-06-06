import java.util.Scanner;
import java.io.File;
import p2utils.*;

public class NumberValue {
  public static void main(String[] args) {
    KeyValueList<Integer> numbers = new KeyValueList<>();

    // Read File
    try{
      File in = new File("numbers.txt");
      Scanner reader = new Scanner(in);
      while(reader.hasNextLine()){
        String[] line = reader.nextLine().split("-");
        numbers.set(line[1].trim(), Integer.parseInt(line[0].trim()));
      }
      reader.close();
    }catch(Exception err){
      System.err.println(err);
    }

    // Read Input
    Scanner sc = new Scanner(System.in);
    String[] input = sc.nextLine().split(" ");
    int temp = 1;
    int result = 0;
    for (int i = 0; i < input.length; i++) {
      int value = numbers.get(input[i]);
      if(temp>value){
        result += temp;
        temp = 1;
      }
      temp *= value;
    }
    result += temp;
    
    System.out.println(result);
  }
}
