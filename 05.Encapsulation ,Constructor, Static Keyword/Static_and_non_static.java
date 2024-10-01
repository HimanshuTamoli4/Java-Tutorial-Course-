class demo1{
    static int a ;
     static int  b ;
     int m ;
     int n ;

     static{
        System.out.println("Control in static block "); ;
        a=10 ;
        b = 20 ;

     }

{
        System.out.println("Control in non static block "); ;
        m= 30 ;
        n = 40 ;
     }

     static void disp1(){
                 System.err.println("The value of static variable  a is "+ a);
           System.err.println("The value of static variable b is "+ b);

     }
     public void disp2(){
               System.err.println("The value of Non static variable  m is "+ m);
           System.err.println("The value of Non static variable n is "+ n);
 
     }

}


public class Static_and_non_static {

    public static void main(String[] args) {

        demo1 d1 =  new demo1();
        demo1.disp1();
        d1.disp2();
         
     




    }
    
}
