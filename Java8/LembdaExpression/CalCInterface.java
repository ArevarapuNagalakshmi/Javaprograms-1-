package Java8.LembdaExpression;
 interface CalCIn{
    public abstract  int sum(int a1,int b);
}
public class CalCInterface {
    public static void main(String[] args) {
        CalCIn a=(a1,b)->a1+b;
        System.out.println(a.sum(10,20));
    }
}
