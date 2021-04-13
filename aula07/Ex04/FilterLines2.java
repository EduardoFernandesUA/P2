import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import p2utils.LinkedList;

public class FilterLines2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        try {
            File input = new File("input.txt");
            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if(data.length()<20){
                    list.addFirst(data);
                }else{
                    list.addLast(data);
                }
            
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception!");
        }

        list.print();
    }
}
