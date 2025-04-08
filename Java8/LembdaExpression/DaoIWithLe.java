package Java8.LembdaExpression;
interface DaoI{
    public abstract void m1();
}
public class DaoIWithLe  {
    public static void main(String[] args) {
        DaoI a=()->{
            System.out.println("m1 is success");
        };
        a.m1();
    }
}
