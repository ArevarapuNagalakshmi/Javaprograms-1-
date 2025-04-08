package Java8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface FunctionTwo{
    public abstract int apply(List enames);
}

public class UserdefinedwithoutLe implements FunctionTwo{
    @Override
    public int apply(List enames) {
        return enames.size();
    }

    public static void main(String[] args) {
        List<String>enames=Arrays.asList("asdfgh","aSDF","dejhyu");
        FunctionTwo a=new UserdefinedwithoutLe();
        System.out.println(a.apply(enames));
    }

}
