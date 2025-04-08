package Java8.FunctionalInterface;
@FunctionalInterface
interface Dao{
    public abstract void m1();
}
public class Fi1 {
    public static void main(String[] args) {
        Dao a=()->{
            System.out.println("m1 is sucess");
        };
        a.m1();
    }
}
