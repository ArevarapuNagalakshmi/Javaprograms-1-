package OOPS.OOP2Demo;

public class Account extends Bank {
    private String Name;
    private String Email;

    public Account(String name, String email) {
        this.Name = name;
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public void m1() {

    }
}
