package Programs;

public class Voewls {

    public static void main(String[] args) {
        System.out.println(m("hello"));
        System.out.println(m("hi"));
    }
    public static boolean m(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
