import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Ex05{
    public static void main(String[] args) {
        assert args.length>=2 : "Use two arguments: ./run.sh <file> <n>";
        int n = 0;
        try{
            n = Integer.parseInt(args[1]);
        } catch(NumberFormatException e){
            System.err.println("Seccund argument need's to be a number!");
            System.exit(2);
        }
        try{
            File file = new File(args[0]);
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
                String[] words = fileScanner.nextLine().split("[ \t]+");
                String nWord = "";
                if(words.length>=n) nWord = words[n-1];
                System.out.println(nWord);
            }
        } catch(FileNotFoundException e) {
            System.err.println("Ficheiro não existe");
            System.exit(3);
        }
    }
}