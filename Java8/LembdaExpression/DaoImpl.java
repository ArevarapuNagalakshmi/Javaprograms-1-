package Java8.LembdaExpression;

interface  DaoInterface{
    public abstract void m1();

}
public class DaoImpl {
    public static void main(String[] args) {
        DaoInterface a=()->{
            System.out.println("m1 is sucess");
        };
        a.m1();
    }
}
