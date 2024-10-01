class student{
   private int age ;
   private String name ;

        void setdata(int n , String m){
            age = n ;
            name = m ;

        }

        public void show(){
            System.out.println(name + " " +  age );
        }

}


public class Encapsulation {
    public static void main(String[] args) {

        student obj1 = new student() ;
        
        student obj2 = new student() ;

       // obj.age = 16 // --> it is not possible because age and name are provate memebers
        // obj.name = "Himanshu" // --> it is not possible because age and name are provate memebers

        obj1.setdata(20, "Ishita");
        obj1.show();

             obj2.setdata(16, "Himanshu");
        obj2.show();
        
    }
    
}
