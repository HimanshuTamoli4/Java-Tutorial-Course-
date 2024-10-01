interface A{
    void show();
    default void disp(){  // now we can define a method in interface class by the keyword of default 
        System.out.println(" we are in display method");
    }

    static void add(){
        System.out.println("Controll in add method ");
    }
}

class B implements A{
   public void show(){
        System.out.println(" we are in show method");
    }
}

public class Features_and_functional04 {
    public static void main(String[] args) {
        A obj =  new B();
        obj.show();
        A.add();
        obj.disp();
        
    }
    
}
