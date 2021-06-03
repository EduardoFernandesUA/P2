import java.io.File;
import java.util.Scanner;

import p2utils.*;

public class CheckPasswd {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    KeyValueList<String> list = new KeyValueList<String>();

    // Read File
    try{
      File in = new File(args[0]);
      Scanner reader = new Scanner(in);
      while(reader.hasNextLine()){
        String[] line = reader.nextLine().split(" ");
        list.set(line[0], line[1]);
      }
      reader.close();
    }catch(Exception err){
      System.err.println(err);
    }

    // Get authentications
    while(true){
      String key = "", value = "";
      try{
        System.out.print("Username: ");
        key = sc.next();
        System.out.print("Password: ");
        value = sc.next();
      }catch(Exception err){
        System.out.println("<Ctrl-d>");
        System.exit(0);
      }
      if(list.get(key).equals(value)){
        System.out.println("Authentication successful\n");
      } else{
        System.out.println("Authentication failed\n");
      }
    }

    
  }
}
