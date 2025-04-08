//Inheritance
package OOPS.Oop1Demo;

public class Demo {
    public static void main(String[] args) {
        SA s1=new SA();
        s1.setAcc_Id(101);
        s1.setAcc_Name("Rahul");
        s1.setAcc_Email("rg@gmail.com");
        s1.setAcc_Bal(5000);
        s1.cal_Bal();

        CA c1=new CA();
        c1.setAcc_Id(2001);
        c1.setAcc_Name("Sonia");
        c1.setAcc_Email("sg@gmail.com");
        c1.setAcc_Bal(55000);
        c1.cal_Bal();
    }
}