package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class MoveAllNegativeElementsEnd {

  public static int[] move(int[] arr){

    int neg = arr.length - 1;
    for (int i = 0; i < neg; i++) {
      if( arr[i] < 0){
        int temp = arr[i];
        arr[i] = arr[neg];
        arr[neg] = temp;
        neg--;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[] = {1 ,-1 ,-3 , -2, 7, 5, 11, 6 };
   Arrays.sprint(move(arr));
  }
}
