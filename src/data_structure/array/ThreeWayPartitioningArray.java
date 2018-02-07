package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class ThreeWayPartitioningArray {

  public static int[] rearrange(int[] arr, int low, int high) {
    int n = arr.length;
    int start = 0, end = n - 1;
    for (int i = 0; i < end; ) {
      if (arr[i] < low) {
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        start++;
        i++;
      }
      else if (arr[i] > high) {
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        end--;

      } else {
        i++;
      }
    }
    return arr;
}

  public static void main(String[] args) {
    int arr[] = {1, 14, 87, 98, 3, 1, 32};
    Arrays.sprint(rearrange(arr, 10, 20));
  }

}
