class animal{
    public void eat(){
        System.out.println("Animal Eats Everyday");
    }
    public void age(){
    System.out.println("Animals have long life");
    }

    public int sleep(int x){
        x = 10;
        return x;
    }
}

class Tiger extends animal{
    // void eat(){  // --> This will show error becsuse we can not decrease w-visiblity of method in child class but we incrrease it 

    // }
      public void eat(){
        System.out.println("Tiger hunts and eat ");
    }
    // public int age(){  --> it will show error because we can not change the data type of method in derrived class  
    // return  10 ;
    // }
    
    public int sleep(){  // --> this will not a override method it consider as a specialozed method because argyements/ parameters and  must be same in derrived   iu
      int   x = 10;
        return x;
    }

}

public class Override_Method05 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
         
    }
    
}
