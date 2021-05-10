package p2utils;

public class Queue<E> {
  private LinkedList<E> list = new LinkedList<E>();

  public void in(E element) {
    list.addLast(element);
  }

  public E peek() {
    return list.first();
  }

  public void out() {
    list.removeFirst();
  }

  public int size() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }
}