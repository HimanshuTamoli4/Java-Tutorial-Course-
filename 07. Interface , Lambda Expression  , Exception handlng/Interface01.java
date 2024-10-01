interface A{
    int num = 4 ;  //  public static final 
    void show();   //  public static final 

}


public class Interface01{
    public static void main(String[] args) {
        System.out.println(A.num);
        A.num = 45 ; // show error bcause  A is   public static final variable 

        // A obj = new A(); // show error because we can not create object of interface class  
        
    }
}