package Java8.LembdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface ConsumerI{
    public abstract void accept(List enames);
}
public class ConsumerUserDefinewithLE {
    public static void main(String[] args) {
        List<String>enames= Arrays.asList("skdhj","bdhbh","jh");
        ConsumerI c=names -> {
            for(Object name:names){
                System.out.println(name);
            }
        };
        c.accept(enames);
//using predefine functional interface
//        Consumer<List>c1=names->{
//            for (Object ename:names){
//                System.out.println(ename);
//            }
//        };
//        c1.accept(enames);
    }
}
