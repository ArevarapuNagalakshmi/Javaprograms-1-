package OOPS.OOP2Demo;

public class Demo1 {
    public static void main(String[] args){
        Sa s=new Sa(101,"Jyo","Jyo@gmail.com",500000);
        AccountService.m2(s);
        Ca c=new Ca(1003,"Lakshmi","lucky@gmail.com",700000);
        AccountService.m2(c);
    }
}
