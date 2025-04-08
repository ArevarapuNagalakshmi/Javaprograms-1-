package Packages;

public class Test {
    private String getMyName() {
        return "Hello";
    }
    public static void main(String args[]){
        Test t1=new Test();
        System.out.println(t1);
        System.out.println(t1.toString());
        System.out.println(t1.getMyName());
    }

}
