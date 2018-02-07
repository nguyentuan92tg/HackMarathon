package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class FindTheRotation {


  public static int count(int[] arr){
    for (int i = 0; i < arr.length - 1; i++) {
      if(arr[i] > arr[i + 1]){
        return i + 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int arr[] = {7, 9, 11, 12, 15};
    System.out.println(count(arr));
  }

}
