package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class FindMultipleLeftRotations {

  public static int[][] findMultiLeftRotation(int[] arr, int... num ){
    int[][] result = new int[num.length][arr.length];

    for (int i = 0; i < num.length; i++) {
      int[] rotateArr = null;
      for (int j = 0; j < num[i] % arr.length; j++) {

        rotateArr = rotateByOne(arr);
      }
      for (int j = 0; j < rotateArr.length; j++) {
        result[i][j] = rotateArr[j];
      }
    }
    return result;
  }

  private static int[] rotateByOne(int[] arr){
    int temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[arr.length - 1] = temp;
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    System.out.println(findMultiLeftRotation(arr, 14));
  }

}
