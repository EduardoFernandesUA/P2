package p2utils;

public class Stack<E> {
  private LinkedList<E> list = new LinkedList<E>();

  public void push(E element) {
    list.addFirst(element);
  }

  public E top() {
    return list.first();
  }

  public void pop() {
    list.removeFirst();
  }

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
}