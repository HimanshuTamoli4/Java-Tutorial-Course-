import java.util.ArrayList;

import java.util.Collections;

public class Collection_Classes_and_its_inbuilt_Methods04 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(105);
         al.add(18);
        al.add(78);
        al.add(45);
        al.add(98);
        al.add(18);
         al.add(30);
        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);

    int index = Collections.binarySearch(al , 98); 
       System.out.println("98 digit index is :" + index); // --> when it  giving negative value that mean that perticular data in not present in our list 

        Collections.rotate(al, 2);

          System.out.println( " data after rotating  " +al);

          Collections.shuffle(al);
          System.out.println(al);

          int freq = Collections.frequency(al, 18);
          System.out.println(" the frequency of a digit is " + freq);


         ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Ishita");
        al1.add("Himanshu");
        al1.add("Anshika");
        al1.add("Kapil");
        al1.add("Gulshan");
        al1.add("Soumya");
        System.out.println(al1);

        Collections.sort(al1);
        
        System.out.println(al1);

    }

}
