package Programs;

public class Factorial {
    public static void main(String[] args) {

                int num = 5;
                int a = 1;
                for (int i = 1; i <= num; i++) {
                    a *= i;
                }

                System.out.println("Factorial of " + num + " is: " + a);
            }
        }

