package Collections.List.LinkedList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistOne {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList<>();
        LinkedList<Integer>l2=new LinkedList<Integer>();
        List<String> l3=new LinkedList<String>();
        l3.add("sa");
        l3.add("Hello");
        l3.add("Heliiii");
        l3.add("HHhh");
        /*System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        l3.set(0,"ab");//update
        System.out.println(l3);*/
        //iterate LL objects using loops
       /* for(String i=0;i<=l3.size()-1;i++){
            System.out.println(l3.get(i));
        }
        */
        /*for(String l:l3 ){
            System.out.println(l);
        }*/
       /* Iterator iterator=l3.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
       /* int i=0;
        while(i<= l3.size()-1){
            System.out.println(l3.get(i));
            i++;
        }*/
        int i=0;
        do{
            System.out.println(l3.get(i));
            i++;
        }while(i<=l3.size()-1);


    }
}
