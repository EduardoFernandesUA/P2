import p2utils.Queue;
import p2utils.Stack;

public class Palindrome {
  public static void main(String[] args) {
    // criar um queue e um Stack com o input
    String text = String.join(" ", args);
    Queue<String> queue = new Queue<String>();
    Stack<String> stack = new Stack<String>();
    for(String c : text.split("")){
      if(Character.isLetter(c.charAt(0))) continue;
      queue.in(c);
      stack.push(c);
    }

    for (int i = 0; i < queue.size(); i++) {
      if(queue.peek().toLowerCase().equals(stack.top().toLowerCase())){
        queue.out();
        stack.pop();
        continue;
      }
      System.out.println("Não é palíndromo!");
      return;
    }
    System.out.println("A frase é um palindrome!");
  }
}
