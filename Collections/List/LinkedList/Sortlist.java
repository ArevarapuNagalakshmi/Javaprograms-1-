package Collections.List.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sortlist {
    public static void main(String[] args) {
        LinkedList<String> l3=new LinkedList<String>();
        l3.add("sa");
        l3.add("tt");
        l3.add("ael");
        l3.add("gHhh");
        System.out.println(l3);//sort the list
        Collections.sort(l3);
        System.out.println(l3);
    }
}
