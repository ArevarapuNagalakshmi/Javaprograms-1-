package OOPS.OOP2Demo;

public class Demo {
    public static void main(String args[]){
        Sa s=new Sa(101,"Jyo","Jyo@gmail.com",500000);
        Sa s1=new Sa(102,"Hari","Hari@gmail.com",600000);
        s.m1();
        s1.m1();
        //AccountService.m2(s);
       // AccountService.m2(s1);
        Ca c=new Ca(1003,"Lakshmi","lucky@gmail.com",700000);
        Ca c1=new Ca(1003,"Lakshmi","lucky@gmail.com",700000);
        c.m1();
       c1.m1();
        //AccountService.m2(c);
       // AccountService.m2(c1);
    }
}
