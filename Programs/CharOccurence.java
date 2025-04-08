package Programs;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharOccurence {
    public static void main(String[] args) {
        String s1="aabbcchjhamdshjdhdvdbdgh";
       /* Map<Character,Integer> countMap=new HashMap<>();
        for(char c:s1.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        System.out.println(countMap);*/

        Map<Character,Long>m1= s1.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m1);
    }


}
