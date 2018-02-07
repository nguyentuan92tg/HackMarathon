package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class SortArrayWaveForm {

  public static int[] sortWave(int[] arr){
    sort(arr);

    int i = 1;
    while (i < arr.length){
      int temp = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = temp;
      i+=2;
    }
    return arr;
  }

  private static void sort(int[] arr){
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if(arr[i] > arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static int[] sortInWave(int[] arr){

    for (int i = 1; i < arr.length; i++) {
      if(arr[i] < arr[i - 1] && i < arr.length){
        swap(arr, i, i - 1);
      }
      if(arr[i] > arr[i + 1] && i < arr.length){
        swap(arr, i,i + 1);
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int arr[] = {10, 90, 49, 2, 1, 5, 23};
    System.out.println(sortWave(arr));
  }

}
