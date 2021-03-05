import java.util.Scanner;

public class Ex05 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double sum = 0;
        int n = 0;
        while(true){
            double num = in.nextDouble();
            if(num==0) break;
            sum+=num;
            n++;
        }
        System.out.printf("Soma: %.2f\n", sum);
        if(n==0) {
            System.out.println("Lista Vazia!");
            return;
        }
        System.out.printf("Média: %.2f\n", sum/n);
    }
}
