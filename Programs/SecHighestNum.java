package Programs;

import java.util.Arrays;

public class SecHighestNum {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,6,7};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
