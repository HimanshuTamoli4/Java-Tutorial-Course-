// Note --> we can create a constructor abstract because it have a super() method it means it have a body / implimation

abstract class Aeroplane {

    // abstract int a ; //----> it willl show error because we can not use abstract variale 

   abstract  public void takeoff() ;  // --> methods whichare not using in child class 

   abstract  public void fly();  // methods which do not have any implimation in them must declare abstract otherwiseit shows errror 
                                // And the class having a minimum one abstract  method must declare abstract class

    public void landing(){
        System.out.println("AeroPlane is landing ");
    }                            
}                          

class Cargoplane extends Aeroplane { 

     public void takeoff() {
        System.out.println("Cargoplane requires longer runway ");

    }

    public void fly() {
        System.out.println("Cargoplane is Flying at lower heights ");

    }

    public void alert(){
        System.out.println("Alert..!");
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
public class Abstraction10 {
    public static void main(String[] args) {

        Aeroplane cp = new Cargoplane(); // We can create object same class and other than only by the name of parent class 
        cp.takeoff(); // -->it will not show error because  we can call  overriden  methods of child  class by the refrence of parent class
        cp.fly();
     
        //   cp.alert(); // --> it will show error because we can not call specialized methods of child  class by the refrence of parent class 
      
        //  we can acceess the specualized method by this way ==>
        ((Cargoplane) cp).alert();  // --> it is  called down casting 
      
        Aeroplane pp = new Passengerplane();

        pp.takeoff();
        pp.fly();  
        pp.landing();  // --> it will not show error because  we can call  inheritted methods of child  class by the refrence of parent class
       //  Aeroplane ap =  new Aeroplane();   ----> We can not create oject of  abstract class 
       
    }
    
}
