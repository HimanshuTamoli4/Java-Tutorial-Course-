import java.util.ArrayList;

class student{
    private String name ;
    private int id ;
}

class employee1{
    private String name ;
    private int id ;
}



public class Need_of_Generics02 {
    public static void main(String[] args) {
        student st1 = new student();
           student st2 = new student();
        
           employee1 E1 = new employee1() ;
           
           employee1 E2 = new employee1() ;

           ArrayList<student> al = new ArrayList<student>();
           al.add(st1);
            al.add(st2);
           // al.add(E);--> shows error because only student type of data can stored hence type safety is
           
    }
    
}
