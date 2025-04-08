package ObjectClass;
class A{
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
public class Method1 {
    public static void main(String args[]){
        A a=new A();
        A a1=new A();
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a.equals(a1));
        System.out.println(a1.toString());
    }
}