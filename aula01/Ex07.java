import java.io.*;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // READ
        try {
            File a = new File(args[0]);
            Scanner aReader = new Scanner(a);

            FileWriter bWriter = new FileWriter(args[1]);

            while (aReader.hasNextLine()) {
                String data = aReader.nextLine();
                bWriter.write(data+"\n");
                //System.out.println(data);
            }

            aReader.close();
            bWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
