import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap07 {
    public static void main(String[] args) {
           HashMap hm = new HashMap() ;
           hm.put(01, "Ishita");
           hm.put(02, "Himanshu");
           hm.put(03, "Anshika");
           hm.put(null, null);
           hm.put(04, "Himanshu");
           System.out.println(hm);

         LinkedHashMap lhm1 = new LinkedHashMap() ;
           lhm1.put("Ishita", 01 );
           lhm1.put("Himanshu", 02 );
           lhm1.put("Anshika", 03);
        1
           System.out.println(lhm1);



    }
    
}
// Note ==> 1. null allowed in both key and value 
//          2.  Key must be unique 
//          3.  value can be uniwue or can not be unique 
//          4. duplicates are allowed
//          5. key can be any type of data 
//          6.   value  can be any type of data 
//          7.   hash map do not assures retaining of order of insertion 
//          8. In the LinkedHashmap order of inertion is preserved