package Java8.Interface;
interface CalInterface{
    public abstract int sum(int a,int b);
}
public class Calculate implements CalInterface{
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        CalInterface a=new Calculate ();
        System.out.println(a.sum(10,20));
    }


}
