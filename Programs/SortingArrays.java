package Programs;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] arr = {9, 0, 3, 4, 6, 5, 2};
        // Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
      /*  for (int i = 0; i <= arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }*/
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

