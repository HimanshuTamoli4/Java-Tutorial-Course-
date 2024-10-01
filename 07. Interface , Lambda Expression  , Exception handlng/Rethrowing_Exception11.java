// We forcus in this file following topics - 1. Throws  Keyword
//                                           2. Throw  Keyword
//                                          Difffrence between throws and throw 



public class Rethrowing_Exception11 {
    public static void main(String[] args) {
            
        int num1 = 8 ;
        int num2 = -4 ;
          
        try{

            if(num2 < 0 ){ 
              Exception e  = new ArithmeticException("Negative Number ");  // --> Exception ==> we can  write also Exception in place of  ArithmeticException();
              throw e ;
              
            }
            else{
        int  result = num1/num2 ;
        System.out.println(result);
            }
        }
        catch(Exception e){
            System.out.println("Enter a valid Number....!!" + e);
               }
        
    }
    
}
