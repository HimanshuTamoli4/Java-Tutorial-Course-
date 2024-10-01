class student{
    private  int age ;
    private String name ;
    student(){
        //super() ; // ---> super method calls parent class 

        this("sakshi" , 78);
        System.out.println("Default constructor is called ");
       name = "Ishita";
        age  = 26 ;
     }
    
    student(String name ){
        this() ; // --> it calls same class constructor  which do not have any parameters or aruguements 
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



public class This_vs_Super {
    public static void main(String[] args) {
         student st1 = new student();
        st1.disp();
        student st2 = new student("Ishita");
           student st3 = new student("Himanshu" , 16) ;
     st2.disp();
         st3.disp();
   
    }
    
}

/*Notes 1. Super() method calls parent class 
      2. In every constructor default Super() method is present  in firrst line 
      3. if you want to include this()  method in constructor you have to write it 
      4. there is not default this() method present in the constructor 
      5. whenever we write  this() method in constructor Super() does not present in it 
      6. This() and Super method do not comes together  
      7. both the methods this()  and Super()  must always present in the first line of the constructor       
      6. this() calls same class constructor 
*/  