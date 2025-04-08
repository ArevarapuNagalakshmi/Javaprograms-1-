package Programs;

import java.util.Arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        int n=arr.length+1;
        int b=(n*(n+1))/2;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int missingnumber=b-sum;
        System.out.println(Arrays.toString(arr));
        System.out.println("missing number:"+missingnumber);
    }
}
