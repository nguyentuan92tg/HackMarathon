package data_structure.array;

/**
 * Created by nhtuan on 2/5/2018.
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
 */
public class SearchAnElement {


  public static int pivotedBinarySearch(int[] arr, int key) {

    int pivot = findPivot(arr);
    if (key == pivot) {
      return arr[pivot];
    }

    if (arr[0] > key) {
      return searchBinary(arr, pivot +1, arr.length - 1, key);
    }else{
      return searchBinary(arr, 0, pivot, key);
    }
  }

  private static int searchBinary(int[] arr, int low, int high, int key) {

    int mid = (low + high) / 2;

    if (arr[mid] == key) {
      return mid;
    }

    if (arr[mid] > key) {
      return searchBinary(arr, low, mid - 1, key);
    } else {
      return searchBinary(arr, mid + 1, high, key);
    }

  }

  private static int findPivot(int[] arr) {
    int pivot = Integer.MIN_VALUE;
    int pos = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > pivot) {
        pivot = arr[i];
        pos = i;
      }
    }
    return pos;
  }

  public static void main(String[] args) {
    int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    System.out.println(pivotedBinarySearch(arr, 3));
  }

}
