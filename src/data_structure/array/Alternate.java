package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class Alternate {

  public static int[] rearrange(int[] arr){

    int j = 0;
    for (int i = 0; i < arr.length; i++) {

      if(arr[i] < 0){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        j++;
      }
    }

    int nev = 0;
    int pos = j;

    while (nev < arr.length && arr[nev] < 0 && pos < arr.length){
      int temp = arr[nev];
      arr[nev] = arr[pos];
      arr[pos] = temp;
      nev+=2;
      pos++;
    }
    return arr;
  }


  public static void main(String[] args) {
    int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
    System.out.println(rearrange(arr));
  }

}
