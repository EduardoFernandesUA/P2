import static java.lang.System.*;

/**
 * Run with:
 * javac Levenshtein.java && (java -ea Levenshtein lista lata; rm Levenshtein.class)
 */
public class Levenshtein
{
  public static void main(String[] args) {
    if (args.length != 2) {
      out.println("Uso: java -ea Levenshtein <palavra1> <palavra2>");
      exit(1);
    }

    int d = distancia(args[0], args[1]);
    out.printf("\"%s\" <-> \"%s\" = %d\n", args[0], args[1], d);
  }

  public static int distancia(String P1, String P2) {
    if(P1.length()==0) return P2.length();
    if(P2.length()==0) return P1.length();
    char C1 = P1.charAt(0);
    char C2 = P2.charAt(0);
    String S1 = P1.substring(1);
    String S2 = P2.substring(1);
    if( C1==C2 ) {
      return distancia(S1,S2);
    }
    else {
      int a = distancia(S1, P2);
      int b = distancia(P1, S2);
      int c = distancia(S1, S2);
      return 1 + Math.min( Math.min(a,b), c);
    }
  }
}
