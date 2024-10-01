public class Logical_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
        int c = 30 ;
        System.out.println(a == b && a <= b && a >= b && a>b && a<b); // ==> this is AND operator if all conditions are true then only result can true 
        System.out.println(a == b || a <= c || a >= b || a>c || a<b); // ==> this is a OR operator there need to be minimum one condition is true to get the result true 
        System.out.println(a!=c);  // ==> this is a NOT operator it return true if condition is false and returns false if comndition is true 
        

    }
    
}
