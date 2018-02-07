package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class RearrangePositiveAndNegative {


  public static int[] rearrange(int[] arr){
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] < 0){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
    Arrays.sprint(rearrange(arr));
  }

}
