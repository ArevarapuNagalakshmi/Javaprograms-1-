package Java8.LembdaExpression;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface FunctionOne{  //use defined fi with le
    public abstract int apply(List names);
}
public class UserDefinedWithle {
    public static void main(String[] args) {
        FunctionOne f=enames->enames.size();
        List<String>enames= Arrays.asList("Rg","vb","jhg","jhg");
        System.out.println(f.apply(enames));
    }
}
