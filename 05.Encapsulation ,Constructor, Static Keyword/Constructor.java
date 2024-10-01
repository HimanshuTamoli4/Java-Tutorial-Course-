
class student {
    private int age;
    private String name;

    student(String name , int age ){
        this.age = age;
        this.name = name ;

    }

    // void setdata(int age, String m) {
      

    //     this.age = age;

    //     name = m;

    // }

    public void show() {
        System.out.println(name + " " + age);
    }

}

public class Constructor {
    public static void main(String[] args) {

        student obj1 = new student("Ishita" , 20);

        student obj2 = new student("Himanshu" , 16);

        
        obj1.show();

    
        obj2.show();

    }
}
