package Java8.LembdaExpression;

@FunctionalInterface
interface PredicateOne{  //use defined fi with le
    public abstract Boolean test(String ename);
}
public class PredicateUserdefibneLe {
    public static void main(String[] args) {
        PredicateOne p= ename -> ename.length()>5;
        System.out.println(p.test("sdfg"));
        System.out.println(p.test("fghyfhgfv"));
    }
}
