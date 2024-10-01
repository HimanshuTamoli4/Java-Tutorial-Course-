class student{
    private  int age ;
    private String name ;
    student(){
        System.out.println("Default constructor is called ");
        name = "Ishita";
        age  = 26 ;
    }
    
    student(String name ){
    this.name = name ;
    age = 20 ;    
    
    }
    student(String name , int age ){
        this.age = age ;
        this.name = name ;
    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }

}

public class Constructor_Overloading {
    public static void main(String[] args) {
        student st1 = new student();
        st1.disp();
        student st2 = new student("Ishita");
        st2.disp();
        student st3 = new student("Himanshu", 16);
        st3.disp();
    }
    
}
