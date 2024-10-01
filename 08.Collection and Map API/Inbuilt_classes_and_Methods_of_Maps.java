import java.util.Hashtable;
import java.util.TreeMap;

public class Inbuilt_classes_and_Methods_of_Maps {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(01, "Ishita");
      ht.put(02, "Himanshu");
      //  ht.put(03, "Anshika");
     //   ht.put(null, null);
        ht.put(04, "Himanshu");
    System.out.println(ht);


    ht.putIfAbsent(01, "Ishita");
    ht.putIfAbsent(03, "mom");
       System.out.println(ht);


            TreeMap tm = new TreeMap();
           // Integer i = new Integer();
          //  tm.put(i,"rohit");
              tm.put(1,"rohit");
            tm.put(4,"Gulshan");
            tm.put(1,"Kapil");
            tm.put(3,"Aditya");
            System.out.println(tm);

    
}
}


// Note ==> 1. null do not allowed in both key and value 
//          2.  Key must be unique 
//          3.  value can be uniwue or can not be unique 
//          4. duplicates are allowed
//          5. key can be any type of data 
//          6.   value  can be any type of data 
//          7. TreeMap gives data im acending order