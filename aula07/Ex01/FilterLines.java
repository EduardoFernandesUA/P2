import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import p2utils.LinkedList;

public class FilterLines {
    public static void main(String[] args) {
        LinkedList<String> small = new LinkedList<String>();
        LinkedList<String> medium = new LinkedList<String>();
        LinkedList<String> large = new LinkedList<String>();

        try {
            File input = new File("input.txt");
            Scanner scanner = new Scanner(input);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if(data.length()>40){
                    large.addLast(data);
                }else if(data.length()>20){
                    medium.addLast(data);
                }else{
                    small.addLast(data);
                }
            
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found Exception!");
        }

        System.out.println("\nSmall: ");
        small.print();
        System.out.println("\nMedium: ");
        medium.print();
        System.out.println("\nLarge: ");
        large.print();
    }
}
