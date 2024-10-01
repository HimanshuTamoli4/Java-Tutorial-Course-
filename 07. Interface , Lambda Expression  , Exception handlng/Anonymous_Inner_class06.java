interface car{
    void drive();
}

// class Defender implements car{  // --> instead of this we can define drive method in main method at the time of object creation 
//  public   void drive(){

//     System.out.println("Driving..");
//     }

// }

public class Anonymous_Inner_class06 {
    public static void main(String[] args) {
        
        car obj = new car() {
            public   void drive(){  //  This class is called Anonymous class

     System.out.println("Driving..");  // instead of creating new class for defining methods we can define drive method in main method at the time of object creation like this  in anonymous class 
     }
            
        };

        obj .drive();







    }
}
