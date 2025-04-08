package Programs;
//arr,length,n*(n+1)/2
public class Missingnumbers {
    public static void main(String[] args) {
        /*int[] arr={1,2,3,5,6};
        int n=arr.length+1;
        int expectedSum=(n*(n+1))/2;
        int actualSum=0;
        for(int num:arr){
            actualSum+=num;
        }
        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);*/


                int[] arr = {-1, -2, -3, -5, -6};
                int a = arr[0], b = arr[0], actualSum = 0;
                for (int num : arr) {
                    actualSum += num;
                    if (num < a) a = num;
                    if (num > b) b = num;
                }
                int expectedSum = (b * (b + 1) / 2) - ((a - 1) * a / 2);
                int missingNumber = expectedSum - actualSum;
                System.out.println("Missing Number: " + missingNumber);
            }
        }


