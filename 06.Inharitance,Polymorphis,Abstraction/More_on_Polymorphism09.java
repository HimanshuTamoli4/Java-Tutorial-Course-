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
        System.out.println("Cargoplane requires lower runway ");

    }

    public void fly() {
        System.out.println("Cargoplane is Flying at lower heights ");

    }

   

}

class Fighterplane extends Aeroplane {
 public void takeoff() {
        System.out.println("Fighterplane requires medium size  runway ");

    }

    public void fly() {
        System.out.println("Fighterplane is Flying at High heights ");

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


class Airpot{
    public void poly(Aeroplane ap){

        ap.takeoff();
        ap.fly();

        System.out.println("--------------------------------------------------");




    }

}



public class More_on_Polymorphism09 {
    public static void main(String[] args) {
       
        Aeroplane ap = new Aeroplane();
        Cargoplane cp = new Cargoplane();
        Fighterplane fp = new Fighterplane();
        Passengerplane pp = new Passengerplane();

        Airpot a = new Airpot();
        a.poly(cp);
         a.poly(fp);
            a.poly(pp);
               a.poly(ap);


        
    }
    
}
