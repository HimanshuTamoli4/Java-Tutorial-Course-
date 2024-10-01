// final class animal{
//     public void sleep(){
//       System.out.println("Animal is sleeping ");
//     }
// }

// class Tiger extends animal{ //  -->  show error because it can no =t be the subclass of animal class because it is declared final 

// }

 class animal{
      final int age = 19 ;
   
   final  public void sleep(){ 
   // age = 45 ; //  show errpr n=because age declared final 

      System.out.println("Animal is sleeping ");
    }
}
class Tiger extends animal{ 
    public void sleep(){ // --> show error because final method can not be overidden  

    }

    

}


public class Final_keyword11 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
        
    }
    
}

// Notes ==>  1. final class do not participate in inheritence
//            2. final method participate in inheritence
 //           3. Final method can not be overriden  
 //           4. Value of final declared variable can  not be changed because it is declared final now it will behave as constant   