// Types of Inner class ==>  1. member 
//                           2. static  --> static keyword work only for inner class 
//                           3. Anonymous                      

class A{
    public void show(){
        System.out.println("In show ");
    }
    class B{
        public void display(){
            System.out.println(" In display ");
        }
    }
}
 // 2. now for static class
class C{
    public void sleep(){
        System.out.println("In sleep ");
    }
    static class D{
        public void working(){
            System.out.println(" Working on feild ");
        }
    }
}



public class Inner_class05 {
    public static void main(String[] args) {
        A obj1 = new A();
       // B obj2 = new B();  --> show error because it is  not a right way to create a object of member inner class 
       A.B obj2 = obj1.new B();  // --> Do not  show error because it is   a right way to create a object of member inner class 
        //obj2.display(); --> shows errror
 
        obj1.show();
        obj2.display();

      //  2. Now for static inner class 

      C m1 = new C();
     // D m2 = new D(); // --> show error because it is  not a right way to create a object of member inner class
        C.D m2 = new C.D(); //  Do not  show error because it is   a right way to create a object of member inner class

        m1.sleep();
        m2.working();
        
    }
    
}
