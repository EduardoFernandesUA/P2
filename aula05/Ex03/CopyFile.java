import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        assert args.length>=2 : "Not enough arguments!";

        File input = new File(args[0]);
        assert input.exists() : "File does not exist!";
        assert input.canRead() : "You can't read this file!";

        File output = new File(args[1]);
        if(output.exists()){
            Scanner in = new Scanner(System.in);
            System.out.print("Output file alredy exists, wanna write on top (y/n)? ");
            String confirm = in.nextLine();
            in.close();
            if(!confirm.equals("y")&&!confirm.equals("Y")){
                System.exit(1);
            }
            assert output.canWrite() : "Can not write output file!";
        }
        
        String data = "";
        Scanner inputReader = new Scanner(input);
        while (inputReader.hasNextLine()) {
            data += inputReader.nextLine()+"\n";
        }
        inputReader.close();
        
        FileWriter outputWriter = new FileWriter(args[1]);
        outputWriter.write(data);
        outputWriter.close();


    }
}