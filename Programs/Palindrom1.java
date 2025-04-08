package Programs;

public class Palindrom1 {
    public static  boolean palliandramcheck(String str){
        String s1=new StringBuilder(str).reverse().toString();
        return str.equals(s1);
    }
    public static void main(String[] args) {
        System.out.println(palliandramcheck("madam"));
        System.out.println(palliandramcheck("dady"));
    }
}
