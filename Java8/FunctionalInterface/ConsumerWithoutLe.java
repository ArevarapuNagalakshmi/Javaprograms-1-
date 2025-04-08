package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

interface ConsumerTwo{
    public abstract void accept(List enames);
}
public class ConsumerWithoutLe implements ConsumerTwo {
    @Override
    public void accept(List enames) {
        for(Object ename:enames){
            System.out.println(ename);
        }
    }

    public static void main(String[] args) {
        List<String>names= Arrays.asList("bhhe","dnhehdy","dhuehdu");
        ConsumerTwo c1=new ConsumerWithoutLe();
        c1.accept(names);
    }
}
