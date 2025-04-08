package Java8.FunctionalInterface;
@FunctionalInterface
interface CalCIn{
    public abstract  int sum(int a1,int b);
}
public class Fi2 {
    public static void main(String[] args) {
        CalCIn a=(a1, b)->a1+b;
        System.out.println(a.sum(10,20));
    }
}
