import java.util.Scanner;

public class Ex04 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String[] texto = new String[50];
        for (int i = 0; i < texto.length; i++) {
            texto[i] = in.nextLine();
            if(texto[i].equals("")) break;
        }

        for (int i = 0; i < texto.length; i++) {
            if(texto[i].equals("")) break;
            for (int j = 0; j < texto[i].length(); j++) {
                switch(texto[i].charAt(j)){
                    case 'L':
                        System.out.print("U");
                        break;
                    case 'l':
                        System.out.print("u");
                        break;
                    case 'r':
                    case 'R':
                        break;
                    default:
                        System.out.print(texto[i].charAt(j));
                        break;
                }
            }
            System.out.println();
        }
    }
}
