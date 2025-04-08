package Java8.FunctionalInterface;
interface PredicateTwo{
    public abstract boolean test(String enames);
}
public class Predicatewithoutle implements PredicateTwo {
    @Override
    public boolean test(String enames) {
        return enames.length()>5;
    }
    public static void main(String[] args) {
        PredicateTwo a=new Predicatewithoutle();
        System.out.println(a.test("sndj"));
        System.out.println(a.test("vndfhhy"));
        System.out.println(a.test("snd"));
    }
}
