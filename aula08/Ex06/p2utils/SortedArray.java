package p2utils;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")
public class SortedArray<E extends Comparable<E>> {
  // private attributes
  private E[] array;
  private int size = 0;

  public SortedArray(int length) {
    array = (E[]) Array.newInstance(array.getClass().getComponentType(), length);
  }
  public String toString() {
    String ret = "[" + array[0].toString();
    for (int i = 1; i < array.length; i++) {
      ret += ", " + array[i].toString();
    }
    return "[" + ret + "]";
  }

  /**
   * @return Number of array in the list
   */
  public int size() { return size; }

  /** Checks if the list is empty.
   * @return  {@code true} if list empty, otherwise {@code false}.
   */
  public boolean isEmpty() { return size == 0; }

  /** Checks if the array is full.
   * @return  {@code true} if array full, otherwise {@code false}.
   */
  public boolean isFull() { return size == array.length; }

  /**
   * @return  First element in the list
   */
  public E first() {
    assert !isEmpty(): "empty!";
      return array[0];
  }

  /** Inserts a new element in the list.
   * @param e the element to be inserted
   */
  public void insert(E e) {
    insert(e, 0);
    size++;
  }
  private void insert(E e, int i) {
    if (array[i]==null) return;
    if(e.compareTo(array[i]) < 0){
      E temp = array[i];
      array[i] = e;
      insert(temp, i+1);
      return;
    }
    insert(e, i+1);
  }

  /** Get a element from array
   * @return the elements of @param i index
   */
  public E get(int i){
    return array[i];
  }

  /** Removes the first element in the list.
   */
  public void removeFirst() {
    assert !isEmpty(): "empty!";
    for (int i = 0; i < size-1; i++) {
      array[i] = array[i+1];
    }
    array[size-1] = null;
    size--;
  }

  /** Checks if the list is sorted.
   * @return {@code true} if sorted, {@code false} otherwise
   */
  public boolean isSorted() { 
    if (size < 2)
      return true;
    return isSorted(0); 
  }
  private boolean isSorted(int i) {
    if (array[i+1] == null) return true;
    if (array[i].compareTo(array[i+1]) < 0) return false;
    return isSorted(i++);
  }

  /** Check if list contains element
   * @return {@code true} if found, {@code false} otherwise
   */
  public boolean contains(E e) {
    if(isEmpty()) return false;
    for (int i = 0; i < size; i++) {
      if(array[i].compareTo(e)==0) return true;
    }
    return false;
  }

  /** Merge two different list in to one without changing the list's
   * @return a new list with all the array
   */
  public SortedArray<E> merge(SortedArray<E> array) {
    SortedArray<E> newArray = new SortedArray<E>(size+array.size());
    merge(newArray, this, 0);
    merge(newArray, array, 0);
    return newArray;
  }
  private void merge(SortedArray<E> newArray, SortedArray<E> array, int i) {
    if(array.size()==i) return;
    newArray.insert(array.get(i));
    merge(newArray, array, i+1);
  }
}
