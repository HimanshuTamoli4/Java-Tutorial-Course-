class calc {

public void show(int n ){
    System.out.println("int "+n);

} 
public void show(double n ){
    System.out.println("double "+n);

} 


public void show(byte n ){
    System.out.println("byte "+n);

} 
public void show(short n ){
    System.out.println("short "+n);
}
public void show(char n ){
    System.out.println("char "+n);

} 
public void show(long n ){
    System.out.println("long "+n);

} 

}


public class Automatic_promotion_in_Overloading {
    public static void main(String[] args) {
        
   calc obj1 = new calc() ;
   obj1.show(4);

    

    }
    
}
