class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        super(msg);

    }

}


public class Custom_Exception12 {
    
    public static void main(String[] args) {
            
        int num1 = 8 ;
        int num2 = -4 ;
          
        try{

            if(num2 < 0 ){ 
              Exception e  = new MyException("Negative Number ");  
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

