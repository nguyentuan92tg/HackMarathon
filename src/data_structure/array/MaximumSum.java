package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class MaximumSum {

  public static int findMax(int[] arr){

    int max = sum(arr);
    for (int i = 1; i < arr.length; i++) {
      arr = rotate(arr);
      int sum = sum(arr);
      if(sum > max){
        max = sum;
      }
    }
    return max;
  }

  private static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i]*i;
    }
    return sum;
  }

  private static int[] rotate(int[] arr){
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = temp;
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = {8, 3, 1, 2};
    System.out.println(findMax(arr));
  }

}
