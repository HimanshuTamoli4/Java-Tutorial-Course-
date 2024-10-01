public class Static_Keyword {
    static int a ;
    static{
        System.out.println("static Block");
         a = 10 ;
         System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        
    }
    
}

/*  Order of execution mof program ==> 1. Static variable
                                       2. Static  block     
                                       3. Static  method     
                                       
                                       4. Non Static variable
                                       5. Non Static  block     
                                       6. Non Static  method                                 

 */
