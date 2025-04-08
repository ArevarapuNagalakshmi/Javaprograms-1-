package Programs.Maps;

import java.util.*;

public class OnlyValues {
    public static void main(String[] args) {
        Map<Integer,String> a=new HashMap<>();
        a.put(1,"vamsi");
        a.put(2,"gayi");
        a.put(3,"lucky");
        a.put(4,"sai");
        a.put(5,"sravani");
        System.out.println(a);

        Set<Integer>s=a.keySet();
        System.out.println(s);

        Collection<String>c=a.values();
        System.out.println(c);

        List<String>l=new ArrayList<>(c);
        Collections.sort(l);
        System.out.println(l);
    }
}
