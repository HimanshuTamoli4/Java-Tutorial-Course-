import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet05 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
           hs.add(30);
            hs.add(40);
               hs.add(20);  

          System.out.println(hs);

          LinkedHashSet hs1 = new LinkedHashSet();
      hs1.add(100);
       hs1.add(30);
        hs1.add(40);
               hs1.add(20); 
System.out.println(hs1);       



    }
    
    
}

// Notes ==>  1. hashset Stores data randomlu
//              2. linkedhashset stores the data in the order of insertion(in order in which they are enterd )   