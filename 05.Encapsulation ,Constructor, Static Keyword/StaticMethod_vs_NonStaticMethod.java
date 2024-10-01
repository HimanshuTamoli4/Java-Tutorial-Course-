class demo {
    static void disp1() {
        System.out.println("Static method disp1 ");

    }

    public void disp2() {
        System.out.println(" Non Static method disp2 ");
    }

}

public class StaticMethod_vs_NonStaticMethod {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo.disp1();
         // demo.disp2(); ----> this will show error because of disp2() method is not static method
         d1.disp2();
          d1.disp1(); // ----> this will not show  error because of disp1() method is  static method    they can also called by the  name of object      

    } 
    }

/*
 * Note -- 1. Static method can be invoked directly by the class name without
 * creating the object
 * 2. Non static method are object dependent they can not called directly by te
 * class name
 * 3. Non static method they can called only bye the object
 * 4. static method are object independent
 * 5. static method can also be called by the object
 */