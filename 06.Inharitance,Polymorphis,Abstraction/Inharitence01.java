class Human{  // Super class , base class and pare4nt class
    int age ;
    void sleep(){
        age = 18;
        System.out.println("Human needs goods sleep");
        System.out.println(age);
    }
}

class Student extends Human{  // Sub class , child class , derived class 

}



public class Inharitence01 {
    public static void main(String[] args) {

        Student st1 = new Student();
        st1.sleep();

        
    }
    
}
