package Programs;

import java.util.Arrays;

public class DuplicatesofArray {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 3, 5, 7};
        int arr2[] = {2, 3, 4, 3, 6, 8, 1, 2};
        int merge[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1)
            merge[index++] = num;
        for (int num : arr2)
            merge[index++] = num;
        Arrays.sort(merge);
        for(int i=0;i<arr1.length;i++){
            int c=0;
            for(int j=1;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr2[j]=0;
                    c++;
                }
                if(arr2[j]!=0){
                    System.out.println(arr1[i] +c);
                }

            }
        }
    }
}
