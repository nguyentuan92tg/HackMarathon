package data_structure.array;

/**
 * Created by nhtuan on 2/6/2018.
 */
public class PairInSortedRotated {

  public static boolean checkPairIsSum(int[] arr, int sum) {
    int n = arr.length;
    int maxIndex = findPivot(arr);
    int minIndex = (maxIndex + 1) % n;

    while (maxIndex != minIndex) {
      if (arr[maxIndex] + arr[minIndex] == sum) {
        return true;
      } else if (arr[maxIndex] + arr[minIndex] < sum) {
        minIndex = (minIndex + 1) % n;
      } else {
        maxIndex = (n + maxIndex - 1) % n;
      }
    }
    return true;
  }

  private static int findPivot(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] < arr[i]) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = {11, 15, 6, 8, 9, 10};
    int sum = 16;
    System.out.println(checkPairIsSum(arr, sum));
  }

}

