import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.List;
import java.util.ListIterator;


public class Itretor_ListItretor {
    public static void main(String[] args) {
           ArrayList al = new ArrayList();

          al.add(20);
          al.add(10);
          al.add(30);
          al.add(40);
          
       // System.out.println(al);
        // for(int i = 0 ; i<al1.size() ; i++){
        //     Object o =  al1.get(i);
        //     System.out.println(o); // ==   System.out.println(al1;get(i));
        // }
    
    // for each ==>
    // for( Object o:al1){
    //     System.out.println(o);  
    // }

   // Note ==> Loops concept is not highly recomended for fetching the data of lists 

 // Iterator itr =   al.iterator();
// while(itr.hasNext())
// {
// // Integer i =  (Integer)itr.next();
//  System.out.println(itr.next());
    
// }



 ListIterator litr = al.listIterator();

while (litr.hasPrevious()) {
    litr.next();
   // System.out.println(litr.next());
    System.out.println(litr.previous());
    
}




    }
}
