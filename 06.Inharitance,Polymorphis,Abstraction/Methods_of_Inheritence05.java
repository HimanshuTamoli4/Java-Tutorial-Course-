class Aeroplane {
    public void takeoff() {
        System.out.println("Aeroplane is taking off");

    }

    public void fly() {
        System.out.println("Aeroplane is Flying ");

    }
}

class Cargoplane extends Aeroplane { // 1. Inheritated method --> we inharit the methods from parent class into child
                                     // class same we do not change anything in these methods

    public void carrygoods() {
        System.out.println("Cargo plane carries goods ");
    }

}

class Passengerplane extends Aeroplane {
    public void fly() { // 2. Overridden Method --> we overwrite the methods of parent class in child
                        // class as per the need
        System.out.println("Passanger Plane is Flying at Lower heights  ");

    }

    public void Passangergoods() { // 3. Specialized method -> they are not present in parent class but presnt in
                                   // the child class
        System.out.println("Passanger plane carries Passanger ");
    }

}

public class Methods_of_Inheritence05 {
    public static void main(String[] args) {

        Cargoplane cp = new Cargoplane();
        cp.takeoff();
        cp.fly();

        Passengerplane pp = new Passengerplane();

        pp.takeoff();
        pp.fly();
        pp.Passangergoods();
        cp.carrygoods();

    }

}
