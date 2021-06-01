import static java.lang.System.*;
import java.util.Scanner;
import p2utils.Stack;

public class HanoiTowers
{
  Stack<Integer> tInicial = new Stack<Integer>();
  Stack<Integer> tAuxiliar = new Stack<Integer>();
  Stack<Integer> tFinal = new Stack<Integer>();

  int moves = 0;

  HanoiTowers(int n){
    for (int i = 0; i < n; i++) {
      tInicial.push(n-i);
    }
    System.out.println("After "+moves+" moves:");
    System.out.println("A: " + tInicial.reverseToString());
    System.out.println("B: " + tAuxiliar.reverseToString());
    System.out.println("C: " + tFinal.reverseToString());
  }

  public int numberOfMoves() {return moves;}

  public void moveDisk(Stack<Integer> a,Stack<Integer> b){
    int n = a.top();
    a.pop();
    b.push(n);
    moves++;
    System.out.println("\nAfter "+moves+" moves:");
    System.out.println("A: " + tInicial.reverseToString());
    System.out.println("B: " + tAuxiliar.reverseToString());
    System.out.println("C: " + tFinal.reverseToString());
  }

  public void solve(){
    solve(tInicial.size(),tInicial,tFinal,tAuxiliar);
  }
  public void solve(int n, Stack<Integer> posteInicial, Stack<Integer> posteAuxiliar, Stack<Integer> posteFinal){
    if(n==0) {
      if(posteInicial.size()==0) return;
      moveDisk(posteInicial, posteFinal);
    }else{
      solve(n-1,posteInicial,posteFinal,posteAuxiliar);
      if(posteInicial.size()==0) return;
      moveDisk(posteInicial, posteFinal);
      solve(n-1,posteAuxiliar,posteInicial,posteFinal);
    }
  }
}
