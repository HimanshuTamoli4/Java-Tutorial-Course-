import java.util.*;

public class Array_Deque02 {
    public static void main(String[] args) {
        ArrayDeque ad1 =  new ArrayDeque();
        ad1.add(100);   //  --> in add method it is compulsory to add data 
        ad1.add(78);
        ad1.add(78);  //  Duplicates allowed in arrayDeque
        System.out.println(ad1);
        ad1.addFirst(30);
        ad1.addLast(18);
        System.out.println(ad1);
        ad1.add("Ishita");
        ad1.add('H');
          ad1.add(1.78);
    System.out.println(ad1);
    ad1.offer(500);  // -->  in Offer method it is compulsory to add data it maybe rejected and not added 
    ad1.offerFirst(10);
    ad1.offerLast(14);
    System.out.println(ad1);

    }
}
