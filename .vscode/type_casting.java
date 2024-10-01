

public class type_casting {
    public static void main(String[] args) {
        int a = 45 ;
        double b ;
        b = a;   //  ==> this is implicit type casting  
        System.out.println(b);

        double c= 45.56 ;
        int d ;
        // d = c ; ==> this will show error because double is greater than int
         d = (int)c; // ==> this will not show error because we change the behaviour of c from double to int and this is called explicit type casting
        System.out.println(d);

    }
    
}
