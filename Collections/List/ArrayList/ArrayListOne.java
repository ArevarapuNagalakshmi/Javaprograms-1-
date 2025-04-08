package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        System.out.println(al);
        al.add(101);
        al.add("Mahi");
        al.add(100000);
        al.add("Delhi");
        System.out.println(al);
        for (int i=0;i<=al.size()-1;i++){
            System.out.println(al.get(i));
        }
    }
}
