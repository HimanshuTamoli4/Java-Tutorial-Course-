import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;

public class Stream_API04 {
    public static void main(String[] args) {
            List<Integer> list1 =  Arrays.asList(8,4,2,7,5);
      //   System.out.println(list1);
         Stream<Integer> streamdata = list1.stream();
        // Predicate<Integer> pre = i->i%2==0;
        
         //Stream<Integer> Fildata  = streamdata.filter(n->n%2==0);  // -> Gives only even  no and if write n%2 == 1  then it gives only odd data
        //2nd way of wrting it 
        Stream<Integer> Finaldata  = streamdata.filter(n->n%2==0).sorted().map(n->n*2);
        Finaldata.forEach(n->System.out.println(n));

        //  Stream<Integer> sortdata = Fildata.sorted();
        //  Stream<Integer> mapStream =  sortdata.map(n->n*2);
        // mapStream.forEach(n->System.out.println(n));

     
          
        //  long count = streamdata.count();
        //  System.out.println(count);

        // Stream<Integer> sortdata = streamdata.sorted();
        //  sortdata.forEach(n->System.out.println(n));

      //  Stream<Integer> mapStream =  sortdata.map(n->n*2);
       //  mapStream.forEach(n->System.out.println(n));

    //  streamdata.forEach(n->System.out.println(n)); //--> this will show error because only one time operating can be done on stream 
    }
}
