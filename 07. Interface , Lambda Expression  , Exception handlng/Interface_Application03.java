 interface  Computer{
    public  void compilecode();
}

class Laptop implements Computer{
    public void compilecode(){
        System.out.println(" You got 5 errors ");
    }
}

class dekstop  implements Computer
{
    public void compilecode(){
        System.out.println(" You got 5 errors , faster running code");
    }
}



class Developer{
     // Laptop obj = new Laptop();
    public void buildApp(Computer obj){
        System.out.println("Building App ");
        obj.compilecode();
    }
}




public class Interface_Application03 {
    public static void main(String[] args) {
        //  Laptop obj = new Laptop();
        //  dekstop  obj = new dekstop();
            Computer obj = new dekstop();
        Developer d1 = new Developer();
        d1.buildApp(obj);
        
      
        
    }
    
}
