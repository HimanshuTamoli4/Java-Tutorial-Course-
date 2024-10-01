// All these setters and getters method we can get directly from the source action 



class student{
    int age ;
    String name ;
  

        void setdata(int n , String m){
            age = n ;
            name = m ;

        }

        public int getage(){
            return age ;
            
        
        }
         public String getname(){
            return name ;
            
        
        }

        public void show(){
            System.out.println(name + " " +  age );
        }

}



public class Setters_Getters {
    public static void main(String[] args) {
        
        student obj1 = new student();

        student obj2 = new student();

        obj1.setdata(20, "Ishita");
      //  obj1.show();

        obj2.setdata(16, "Himanshu");
      //  obj2.show();

      String stud1name = obj1.getname();
         int stud2age = obj2.getage();
         System.out.println(stud1name);
            System.out.println(stud2age);


    }
    
}
