
class demo {
    private int a;
    private int b;

    // default construct always available in the class it does not take any
    // arguement or it do not have any parameters
    // demo(){ // ---> Default Constructor

    // }
    demo(){ 
        System.out.println("this is zero parameterized constructor");

     }


    demo(int a, int b) {
        this.a = a;
        this.b = b;

    }

    void disp() {
        System.out.println(a);
        System.out.println(b);

    }

}

public class Constructor02 {
    public static void main(String[] args) {
        // demo d = new demo(); // --> this will show error because we have write
        // constructor in class then complier does not provide the default constructor

        demo d1 = new demo(10, 45);
        d1.disp();

        demo d2 = new demo();
          d2.disp();
        

    }

}

// Note - 1. Default constructor is only available when there is no constructor parameterized or deparameterized inculeded by programmer 
         // 2.  this will show error because we have write
        // constructor in class then complier does not provide the default constructor
      //  3.   default construct always available in the class it does not take any
    // arguement or it do not have any parameters