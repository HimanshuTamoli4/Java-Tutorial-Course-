public class Try_Catch09 {
    public static void main(String[] args) {
        int n1 = 10 ; 
        int n2 = 5 ;
       int res = 0  ;
       String name = null;
        int values[]= {4,6,7,12};
        try{
            // res = n1/ n2 ;
             res = n1 / name.length(); 
             System.out.println(values[5]);
            
        }

        catch(ArithmeticException e){
            System.out.println("Can not dvide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(values[values.length-1]);
            System.out.println("Stay in Your limits" + e) ;
        }

        catch(Exception e ){
           System.out.println("Something Went wrong.." + e );
        }
   
        System.out.println(res);
        System.out.println("Bye");
    }
    
}
