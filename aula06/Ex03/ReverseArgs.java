import static java.lang.System.*;

/**
 * Run with:
 * javac ReverseArgs.java && (java -ea ReverseArgs 5 10 20 40; rm ReverseArgs.class)
 */
public class ReverseArgs {

  public static void main(String[] args) {
    printArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
    if(N==0) return;
    out.println(array[N-1]);
    printArray(array, N-1);
  }

}

