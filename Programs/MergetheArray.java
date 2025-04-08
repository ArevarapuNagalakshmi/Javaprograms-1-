package Programs;

import java.util.Arrays;

public class MergetheArray {
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6};
        int arr2[] = {1, 3, 5};
        int[] MergeArray=new int[arr1.length+arr2.length];
       /* for(int i=0;i<arr1.length;i++){
            MergeArray[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            MergeArray[arr1.length+i]=arr2[i];
        }
        Arrays.sort(MergeArray);
        System.out.println(Arrays.toString(MergeArray));
    }*/
        int index=0;
        for(int num:arr1){
            MergeArray [index++]=num;
        }
        for(int num:arr2){
            MergeArray [index++]=num;
        }
        Arrays.sort(MergeArray);
        System.out.println(Arrays.toString(MergeArray));
    }

}
