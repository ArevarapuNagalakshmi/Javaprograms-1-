package Programs;

public class Randomnumbers {
    public static void main(String[] args) {
                int[] numbers = new int[5];

                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = (int) (Math.random() * 100) + 1;
                }

                System.out.print("Random Numbers: ");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }
            }
        }

