// 3. Hierarchical  inheritnce ==>  in it one base class have a no of derived/child class

class Animal{
    void sleep(){

        System.out.println("Animal needs sleep ");

    }
}

class Tiger extends Animal{

}

class Monkey extends Animal{

}


class deer extends Animal{
    
}


//  4. Multiple inheritnce ===> in it derived class have a multiple base class 
//                               it is not allowed in java bcause it leads ambigiulaty
//                                it is also called diamond shape problem  ex 
  
class parent1{  // extends object class 
    int age = 50;
}
class parent2{
    int age = 44 ;
}

/* 
class child extends parent1 ,parent2{  //  it will show error 

}
*/


public class Hierarchical_and_Multiple_Inheritence04 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
        Animal a =  new Animal();
       // a.equals(a); --> object class method which is inherited in parent class 
       
        
    }
    
}

// Note -> when we doesn't extends class it by default extends  in built object class which is parent class 
