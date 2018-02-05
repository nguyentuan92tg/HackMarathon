package data_structure.array;

import java.util.stream.Stream;

/**
 * Created by nhtuan on 2/2/2018.
 * https://www.geeksforgeeks.org/array-rotation/
 */
public class ArrayRotation {

  /**
   * Solution: Rotate one by one
   * @param arr
   * @param k
   * @return
   */
  public static int[] rotate(int[] arr, int k){

    k = k % arr.length;

    for (int i = 1; i <= k; i++) {
      rotateByOne(arr);
    }
    return arr;
  }

  private static int[] rotateByOne(int[] arr){
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i+1];
    }
    arr[arr.length - 1] = temp;
    return arr;
  }

  private static void printArr(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  //Reversal algorithm for array rotation
  public static int[] rotateUsingReverse(int[] arr, int k){
    reverse(arr, 0, k -1);
    reverse(arr, k, arr.length -1);
    reverse(arr, 0, arr.length -1);
    return arr;
  }

  public static int[] reverse(int[] arr, int start, int end){

    while (start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    printArr(rotateUsingReverse(arr, 2));
  }

}
