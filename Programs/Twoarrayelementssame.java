package Programs;

import java.util.Arrays;

public class Twoarrayelementssame {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5};
        Integer[] a1={1,2,3,4,5};
        Integer[] a2={1,2,3,4,5,6};
        System.out.println(Arrays.equals(a,a1));
        System.out.println(Arrays.equals(a1,a2));
    }
}
