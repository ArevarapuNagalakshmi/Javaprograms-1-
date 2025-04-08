package Strings;


public class Primitivedt {
    public static void main(String args[]){
        int a=100;
        int b=200;
        int c=300;
        String e1=new String();
        String e2=new String();

        String s="Hari";
        String s1="Hari";

        String s2=new String("Hari");
        String s3=new String ("Hari");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(s==s1);
        System.out.println(s==s3);
        System.out.println(s.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(e1==e2);
        System.out.println(s1.equals(a));
//        System.out.println(a==s1);


    }
}
