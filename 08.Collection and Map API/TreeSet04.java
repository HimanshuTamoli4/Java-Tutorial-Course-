import java.util.TreeSet;

public class TreeSet04 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(14);
        ts.add(18);
        ts.add(30);
           ts.add(150);
      ts.add(75);
         ts.add(125);
           ts.add(180);
        System.out.println(ts);
        //    ts.add(18);
        
       System.out.println(ts.higher(75));
       System.out.println(ts.lower(30));
       System.out.println(ts.ceiling(75));
       System.out.println(ts.floor(75));

        System.out.println(ts.ceiling(27));
       System.out.println(ts.floor(123));
       

    }
    
}

// Notes ==> 1. stores data in acending/ increasing order
 //            2.   TreeSet Do not   allows Duplicates
 //            3.   PriorityQueue  only stores integar values