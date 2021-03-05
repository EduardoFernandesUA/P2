import java.util.Scanner;

public class Ex06 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int number = (int) (Math.random()*(100+1));
        int n = 0;
        while(true){
            System.out.printf("Tentativa %d: ", n+1);
            int a = in.nextInt();
            n++;
            if(a>number){
                System.out.print("Maior!\n");
            }else if(a<number){
                System.out.print("Menor!\n");
            }else{
                System.out.printf("\nAcertou após %d tentativas!\n\n", n+1);
                break;
            }
        }
    }
}
