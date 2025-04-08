package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class  FrequencyofNum {
    public static void main(String[] args) {
        //int[] arr={1,1,2,9,9,2,3,4,5,5,6,6,6,7};
        /*int [] count=new int[10];
        for(int num:arr){
            count[num]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]>0) {
                System.out.println(i+"="+count[i]);
            }

        }*/
      /*  for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]=arr[j]){
               int count++;

                }
            }
        }*/
       /* String[] arr={"abcabcabcabcddefe"};
        String[] count=new String[255];
        for(String num:arr){
            char[num]++;
        }*/

       Integer[] arr={1,2,3,4,5,1,2,3,4,5,6,7,8,9,1};
       Map<Integer,Long>m1=Arrays.stream(arr)
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(m1);



    }
}
