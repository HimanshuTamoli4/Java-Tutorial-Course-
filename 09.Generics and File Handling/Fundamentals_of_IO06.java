class student {
    String name;
    int age;
    String city ;

    public student( String name, int age, String city ) {
        this.name  = name ;
        this.age = age;
        this.city = city;
    }
        public String toString() {
        return " Name : " + name + " Age:  " + age + " City:  " + city ;
    }
}

public class Fundamentals_of_IO06 {
    public static void main(String[] args) {
          student st1 = new student( " Ishita ", 28, " Lucknow ");
          System.out.println(st1);
         student st2 = new student( " Anshika", 28, " Hardoi ");
          System.out.println(st2);
        
    }
    
}
