package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("anbghdw");
        al1.add("hjytfvb");
        al1.add("gtrdcvbnm");
        al1.add("kiuytfvb");
        al1.add("mjhgf");
        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);
    }
}
