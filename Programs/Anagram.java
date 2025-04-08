package Programs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
           int num1 = 112, num2 = 211;
           char[] arr1 = Integer.toString(num1).toCharArray();
            char[] arr2 = Integer.toString(num2).toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1,arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        /*int num1 = 112, num2 = 211;
        char[] arr1 = String.valueOf(num1).toCharArray();
        char[] arr2 = String.valueOf(num2).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram Numbers");
        } else {
            System.out.println("Not Anagram Numbers");
        }*/
        }
    }


