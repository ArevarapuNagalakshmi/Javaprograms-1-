package Strings;

public class UnBoxing {
    public static void main(String args[]){
       //WC
        int a=100;
        System.out.println(a);
        //AutoBoxing--converting primitive to object(Wrapper class)
       // Integer a1=Integer.valueOf(a);
        Integer a1=a;
        System.out.println(a1);
        //unBoxing--converting object to primitive
        //int b=a1.intValue();
        int b=a1;
        System.out.println(b);





    }
}
