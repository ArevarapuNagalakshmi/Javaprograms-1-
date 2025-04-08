package OOPS;

public class ConstructorDemo {
    public ConstructorDemo(){
        System.out.println("Constructor method");
    }
    public void m1(){
        System.out.println("Normal method m1");
    }
    public static void main(String args[]){
        new ConstructorDemo();
        new ConstructorDemo();
        new ConstructorDemo();
        new ConstructorDemo();
    }
}
