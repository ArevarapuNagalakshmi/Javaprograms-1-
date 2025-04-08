package Programs;

public class Pallidrom {
    public static void main(String[] args) {
        String a="bob";
        StringBuilder s=new StringBuilder(a);
        String reversedStr=s.reverse().toString();
        if(a.equals(reversedStr)){
            System.out.println(a+ ": is a palindrom.");
        }else{
            System.out.println(a+ " is not a palindrom");
        }
    }
}
