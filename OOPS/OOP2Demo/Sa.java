package OOPS.OOP2Demo;

public class Sa extends Account{
    double min_bal=600;
     int acc_Id;
     double acc_Bal;
    public Sa(int id, String name, String email,double bal) {
        super(name, email);
        this.acc_Id=id;
        this.acc_Bal=bal;


    }
    public void m1(){
        double bal=this.acc_Bal-this.min_bal;
        System.out.println(bal);
    }
}
