package Programs;

public class Fabinoci {
    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
       // System.out.println("Fabinocci series " + n);
        for (int i = 2; i <= n; i++) {
            System.out.print(a+",");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
