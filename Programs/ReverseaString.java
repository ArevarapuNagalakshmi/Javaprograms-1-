package Programs;

import java.util.Arrays;

public class ReverseaString {
    public static void main(String[] args) {
       /* String str="Jyothi";
        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            s1=s1+str.charAt(i);
        }
        System.out.println(s1);*/
        String str="Lakshmi";
        String s1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            s1=ch+s1;
        }
        System.out.println(s1);
    }
    }

