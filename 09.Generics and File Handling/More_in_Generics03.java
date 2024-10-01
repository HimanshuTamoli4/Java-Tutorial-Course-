import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class gen<T>{
    T obj ;
    public gen(T obj ){
        this.obj = obj ;
    }
    void display(){
        System.out.println("The type of data is :  " + obj.getClass().getName());
    }
    public T getObj() {
        return obj;
    }


}



public class More_in_Generics03 {
    public static void main(String[] args) {
        gen<Integer> g = new gen<Integer>(10);
        ArrayList<String> List1 = new ArrayList<String>();
        List<String> List2 = new ArrayList<String>();
        Collection<Integer> List3 = new ArrayList<Integer>();

      //  List<Object> List4 = new ArrayList<String>(); --> show compile time error because of  generic can not be a parent type 
       //  List<int> List5 = new ArrayList<int>();  // --> show compile time error because  only referncetypes are allowed 

           ArrayList<gen> List6 = new ArrayList<gen>();

           g.display();
           System.out.println( g.getObj());
         
 gen<String> g1 = new gen<String>("Ishita");
   g1.display();
           System.out.println( g1.getObj());
         




    }
    
}
