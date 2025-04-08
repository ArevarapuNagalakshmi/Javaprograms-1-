package Java8.PredefineFunctionInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionDemo {
    public static void main(String[] args) {
       // Function<List,Integer> f = enames -> enames.size();
        List<String> names = Arrays.asList("Mani", "Sai", "Sravs", "Lucky", "Pooji");

        Function<List,Integer> f1=enames-> enames.size();
        System.out.println(f1.apply(names));

     //Predicate
        Predicate<List>p1=unames->unames.contains("cbdhch");
        System.out.println(p1.test(names));

        //Consumer

        Consumer<List>c=cnames->{
          for(Object cname:cnames)  {
              System.out.println(cname);
          }
        };
        c.accept(names);

        //Supplier
        Supplier<Integer>s1=()->names.size();
        System.out.println(s1.get());
    }
}
