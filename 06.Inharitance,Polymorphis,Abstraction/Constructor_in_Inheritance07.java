class demo1{
    int a , b ;
    demo1(){
        System.out.println("Parent class constructor ");
    }
    demo1(int x , int y){
        System.out.println("Parameterized parent class constructor ");
        a = x;
        b = y ;

    }
}

    class demo2 extends demo1{
        int m ,  n; 
        demo2(){
            // super(); --> super(); method is by default available in first line of constructor even if do not write it  
            this(10, 32);
            System.out.println("Child class constructor ");
    }

       demo2(int x , int y){ 
        // super(); --> it called the parent class constructor 
        super(10, 45);
        System.out.println("Parameterized Child class constructor ");
        m = x;
        n = y ;

    }

    }

    




public class Constructor_in_Inheritance07 {
    public static void main(String[] args) {

        demo2 d1 = new demo2();
       // demo2 d2 = new demo2(10, 78);
        
    }
    
}
