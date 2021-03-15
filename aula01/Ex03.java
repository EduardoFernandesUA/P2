import static java.lang.System.*;
import java.util.Scanner;

public class Ex03 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        while (true) {
            out.print("N? ");
            n = in.nextInt();
            if (n > 0)
                break;
            err.println("ERROR: invalid number!");
        }

        String verb = isPrime(n) ? "is" : "is not";
        out.printf("Number %d %s prime\n", n, verb);
    }

    public static boolean isPrime(int n) {
        // Complete a função para verificar se n é primo...
        // referencia: https://www.dcc.fc.up.pt/~pbv/aulas/progimp/teoricas/teorica07.html
        for (int i = 2; i * i <= n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
