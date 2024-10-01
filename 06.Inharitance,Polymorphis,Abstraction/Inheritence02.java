class Human{ 
    private String name ;  //  private members are not inheritated 
    int age ;
    Human(){ //  constructors are not inheritated 
        System.out.println("Human class constructor ");
    }
    void sleep(){
        age = 18;
        System.out.println("Human needs goods sleep");
        System.out.println(age);
    }
}

class Student extends Human{   // -> it is single level inheritence 
    // Student(){  // --> default constructor 
    //     super(); //  this will call parent class constructor 
    // }

    void disp(){
        System.out.println("the age is "+ age);
        // System.out.println("the name is "+ name);  --> this 3will show error 
    }

}


public class Inheritence02 {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.sleep();
        st1.disp();
        
    }

    
}
