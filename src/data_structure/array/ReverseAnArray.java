package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class ReverseAnArray {

  public static int[] reverse(int[] arr){
    int i = 0;
    while (i <= arr.length/2){
      int temp = arr[arr.length - 1 -i];
      arr[arr.length - 1 - i] = arr[i];
      arr[i] = temp;
      i++;
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6};
    System.out.println(reverse(arr));
  }

}
