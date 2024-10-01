// package  Static ;

class Alpha{
    static int a ;
     static int b ;

     int m ;
     int n ;

     static{
        System.out.println("static block");
        a = 10 ;
        b = 40 ;
    
     }

     {
        System.out.println(" Non static block");
        m = 44 ;
        n = 78 ;
        
     }
        
}


public class StaticVariable_vs_instanceVariable {
    public static void main(String[] args) {
        
        Alpha a1 = new Alpha();
       Alpha a2   = new Alpha();

            Alpha.a ;
            Alpha.b ;
            a1.m ;
            a2.n ;


    }
    
}
