import java.util.ArrayList;

public class Need_of_Generics01 {
    public static void main(String[] args) {
        //  typesafety 
        String ar[] = new String[10];
        ar[0] = "Ishita";
        ar[1] = "Himanshu";
        //ar[2] = 10 ; //  show compile time error 
        String name1 = ar[0];
        String name2 = ar[1];

 //  ---> No type safety 

 // --> Type safety acihieved using generics 

 ArrayList<String> al = new ArrayList<String>();
        // al.add(10); --> show error because we defined pre4viously that we are storing string  data
        al.add("Ishita");
        al.add("Himanshu");

        // String n1 = (String)al.get(0);  --> type casting is important when we do not define previously type of data
        
        // String n2 = (String)al.get(1);
        
         String n1 = al.get(0);   // --> we can get data without type casting when we  are define previously type of data
        
         String n2 = al.get(1);

    }
}
