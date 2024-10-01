// Lambda expression works only on dunctional (singal  ) interface 
interface car{ 
    void drive();
}

interface Dog{

    void Bark( int age );

}

interface Marks{
    void numbers(int m1 , int m2);
}

public class Lambda_Expression07 {
    public static void main(String[] args) {
        car obj = ()->    System.out.println("Driving..");  // --> This is lambda epression of no parameter method in Interface class   
            
        obj .drive();

        Dog obj1 = age->System.out.println(age +" age dog is barking  "); // --> This is lambda epression of one  parameter method in Interface class 
            
        obj1.Bark(12);

        Marks obj2 = (m1 , m2)->{  // --> This is lambda epression of Two  parameter method in Interface class
            System.out.println("Your marks in  Maths is  "  + m1 );
             System.out.println("Your marks in  Science is  "  + m2 );
        };

        obj2.numbers(100, 96);
     
            
       

        
    }
    
}

 //Note -> 1. If a method contains only one statement then curly brackets->{}  are optional 