package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList<String>enames=new ArrayList<String>();
        enames.add("anbghdw");
        enames.add("hjytfvb");
        enames.add("gtrdcvbnm");
        enames.add("kiuytfvb");
        enames.add("mjhgf");
        for(String ename:enames) {
            System.out.println(ename);
        }
        System.out.println(enames.isEmpty());
        System.out.println(enames.contains("kiuytfvb"));
    }
}
