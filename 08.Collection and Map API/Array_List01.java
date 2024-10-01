

import java.util.*;

public class Array_List01 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);

        System.out.println(al1);
          ArrayList al2 = new ArrayList();

          al2.add(" Ishita ");
          al2.add(10);
          al2.add(1.78);
          al2.add('I');
          
        System.out.println(al2);
                
        al2.add(114);
          System.out.println(al2);

              ArrayList al3 = new ArrayList();

        al3.add(1);
        al3.add(2);
        al3.add(4);
        al3.add(8);
        System.out.println(al3);
   
   int n =      (int)al3.get(2);
   System.out.println(" this is the value of  n " + n);
        al3.add(al2);
    System.out.println(al3);  // -->  we can also add array collection list into another arraylist collection

   al3.add(1, "Himanshu");
         al3.add(2, "j");
                System.out.println(al3);
                al3.add(8);  // --> Duplicates allowed in array List 
                System.out.println(al3);


            
         
    }
    
}
