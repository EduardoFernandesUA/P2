
/**
 * Run with:
 * javac Loan.java && (java -ea Loan 2 1000 1 20; rm Loan.class)
 */
public class Loan {
    public static void main(String[] args) {
        assert args.length == 4 : "Usage: java -ea Loan 2 1000 1 20";
        int months = Integer.parseInt(args[0]);
        double M = Integer.parseInt(args[1]);
        double T = Integer.parseInt(args[2]);
        double P = Integer.parseInt(args[3]);
        System.out.printf("(iterativo) d(%d) = %.1f\n", months, iterLoan(months,M,T,P));
        System.out.printf("(recursivo) d(%d) = %.1f\n", months, recuLoan(months,M,T,P));
    }

    public static double iterLoan(int months, double M, double T, double P) {
        for (int i = 0; i < months; i++) {
            M = M+M*(T*0.01)-P;
        }
        return M;
    }

    public static double recuLoan(int months, double M, double T, double P) {
        if(months==0) return M;
        double a = recuLoan(months-1, M, T, P);
        return a+a*(T*0.01)-P;
    }
}
