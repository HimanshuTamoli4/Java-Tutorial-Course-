// types of polymorphism --> 1. compile time -> method overloading
//                           2. Runt time ->    method overriding   

class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is taking off");

    }

    public void fly() {
        System.out.println("Aeroplane is Flying ");

    }
}

class Cargoplane extends Aeroplane { 

     public void takeoff() {
        System.out.println("Cargoplane requires longer runway ");

    }

    public void fly() {
        System.out.println("Cargoplane is Flying at lower heights ");

    }

   

}

class Passengerplane extends Aeroplane {
 public void takeoff() {
        System.out.println("Passengerplane requires medium size  runway ");

    }

    public void fly() {
        System.out.println("Passengerplane is Flying at medium heights ");

    }
}

public class Polymophism08 {
    public static void main(String[] args) {
        
        Cargoplane cp = new Cargoplane();

        Passengerplane pp = new Passengerplane();

        Aeroplane ap ;
        ap = cp ;  //  Only parent class hold the adress of object of another(child) class
        
        ap.takeoff();
        ap.fly();

        System.out.println("----------------------------------------------------------");

        ap = pp ;
         ap.takeoff();
        ap.fly();

      
        
    }
    
}
