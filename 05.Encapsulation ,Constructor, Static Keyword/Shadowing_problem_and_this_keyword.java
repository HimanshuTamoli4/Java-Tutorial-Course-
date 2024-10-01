// 1.Shadowing problem ocurs when in bject class instance variable and local variable name are same 
// 2. For solving shadowing problen we use this keyword

class student {
    private int age;
    private String name;

    void setdata(int age, String m) {
        // age = age ; // --> this will show error due to same name of intance and local
        // variable compiler gives preference to the local variable

        this.age = age;

        name = m;

    }

    public void show() {
        System.out.println(name + " " + age);
    }

}

public class Shadowing_problem_and_this_keyword {
    public static void main(String[] args) {

        student obj1 = new student();

        student obj2 = new student();

        obj1.setdata(20, "Ishita");
        obj1.show();

        obj2.setdata(16, "Himanshu");
        obj2.show();

    }

}
