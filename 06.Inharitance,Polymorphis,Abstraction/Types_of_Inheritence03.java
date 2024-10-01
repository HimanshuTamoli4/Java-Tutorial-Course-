/*  Types of inheritence ==>  1. Single level inheritnce
                              2. Multi-level inheritnce
                              3. Hierarchical  inheritnce 
                              4. Multiple inheritnce

 
 */

// 1.  Single level  inheritnce ==>  in it one base class have one derived class ex . we have done it's example in previous code 

// 2.   2. Multi-level inheritnce ==>  in it every derived class have a dfferent base class 

class demo1{
    void disp(){
        System.out.println("disp written in demo1 class");
    }

}

class demo2 extends demo1{

}

class demo3 extends demo2 {
    
}


public class Types_of_Inheritence03 {
    public static void main(String[] args) {
        demo3 d1 = new demo3();
        d1.disp();
        
    }
    
}
