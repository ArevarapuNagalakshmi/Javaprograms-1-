package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFive {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        l1.add("Hello");
        l1.add("Ap");
        l1.add("Bp");
        l1.add("Hh");
        l1.add("He");
        /*for(String l:l1){
            System.out.println(l);
        }*/
        /*Iterator iterator=l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        /*for(int i=0;i<=l1.size()-1;i++){
            System.out.println(l1.get(i));
        }*/
        System.out.println(l1);
    }
}
