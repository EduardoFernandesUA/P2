
/**
 * Run with:
 * javac Mdc.java && (java -ea Mdc 30 12; rm Mdc.class)
 */
public class Mdc {
    public static void main(String[] args) {
        assert args.length == 2 : "Usage: java -ea Mdc <a> <b>";
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("MDC( %d, %d) = %d\n", a, b, mdc(a,b));
    }

    public static int mdc(int a, int b){
        if(b==0) return a;
        return mdc(b,a%b);
    }
}
