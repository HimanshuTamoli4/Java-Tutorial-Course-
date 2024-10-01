import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;
public class ForEach_method03{
    public static void main(String[] args) {
        // List<Integer> list1 = new ArrayList<Integer>();
        // list1.add(18);
        // list1.add(32);
        // list1.add(30);
        // list1.add(16);

        // System.out.println(list1);

         List<Integer> list2 =  Arrays.asList(18,32,30,16);
         System.out.println(list2);

        //  for(Integer i : list2){  // --> For Each loop 
        //     System.out.println(i);
        //  }

        // 2nd method of each loops 

        // Consumer<Integer> cons = i-> System.out.println(i);  // lambda expression

        // list2.forEach(n->System.out.println(cons));
        
     
         list2.forEach(n->System.out.println(n));   // lambda expression

        
    }
}
