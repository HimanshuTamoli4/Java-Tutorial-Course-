public class Static_Members {
    
    static int a ;
    static{
        System.out.println("Static block");
        a = 10 ;
    }

    static void disp(){

        System.out.println("Static method");
        System.out.println("The value of a is " + a);
    }


    public static void main(String[] args) {
         System.out.println(" main method");
         disp(); // --> because it is in same class so we can call it without any name of class and object 
        
    }
    
}
