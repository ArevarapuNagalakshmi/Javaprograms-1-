package Strings;

public class StringLiterals {
    public static void main(String args[]){
        String s="Hari";
        String s1=new String("Hari");
        String s2=new String("Hari");
        String e1=new String();
        String e2=new String("Hari");
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s2));
        System.out.println(s.equals(s1));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));

    }
}
