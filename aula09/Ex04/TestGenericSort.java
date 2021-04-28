import static p2utils.Sorting.*;

import java.util.Arrays;

public class TestGenericSort {
  public static void main(String[] args) {
    System.out.println("Before:");
    System.out.println(Arrays.toString(args));
    mergeSort(args, 0, args.length);
    System.out.println("After:");
    System.out.println(Arrays.toString(args));
  }
}
