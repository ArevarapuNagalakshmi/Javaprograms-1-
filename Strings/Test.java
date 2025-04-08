package Strings;

public class Test {
    public static void main(String args[]){
        String s1="Rahul";
        s1.concat(" Gandhi");
        System.out.println(s1);

        String s3="Rahul";
        s3=s3.concat(" gandhi");
        System.out.println(s3);

        StringBuffer s2=new StringBuffer("Hello");
        s2.append(" Hi");
        System.out.println(s2);

    }
}
