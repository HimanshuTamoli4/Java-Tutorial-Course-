public class Exception08 {
     
    public static void main(String[] args) {
        int n1 = 10 ;  // -- normal statement 
        int n2 = 0 ;

     //   int result = n1 * n2 ;    // Critical statement

     int res = 0  ;

     try{
          res = n1 / n2 ; 
         
     }
     catch(Exception obj ){
        System.out.println("Something Went wrong.." + obj );
     }

     System.out.println(res);


    }
    
}

// Types of statement => 1. Normal    Statement
//                       2. Critical  Statement