package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Maximumnumber {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,1,10,1,3};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);

        List<Integer> l1=Arrays.asList(1,2,3,4,5,6,100,500,37,68);
        int max=l1.stream().max(Integer::compare).get();
        System.out.println(max);

        List<Integer> l2=Arrays.asList(1,2,3,4,5,6,100,500,37,68);
        Optional<Integer> secondMax=l2.stream().distinct().sorted((a, b)->b-a).skip(1).findFirst();
        secondMax.ifPresent(System.out::println);
        System.out.println(secondMax);
    }
}
