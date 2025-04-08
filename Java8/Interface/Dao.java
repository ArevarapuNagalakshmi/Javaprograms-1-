package Java8.Interface;
//DaoI--is a data access object interface
//DAo;-data access object
interface DaoI{
    public abstract void m1();
}
public class Dao  implements DaoI{

    @Override
    public void m1() {
        System.out.println("m1 is success");

    }
    public static void main(String[] args) {
        DaoI daoI=new Dao();
        daoI.m1();
    }

}
