import java.util.Scanner;

class farmer{
    int pa ;  // pa -->  principal amount 
    float td ; // td  --> time duration
    static float ri ; // ri --> Rate  of intrest 
    float si ; // si --> simple intrest 
    static{
             ri = 4.5f ;
    }
    
    public void input(){
        Scanner  scan = new Scanner(System.in);
        System.out.println("Please enter the amount required");
        pa = scan.nextInt();
        System.out.println("Please enter the time duration");
        td = scan.nextFloat();
   
    }

   public void compute(){
    si = (pa*td*ri)/100f ;
   } 
public void disp(){
    System.out.println(" your simple itrest amount is "+ si);
}

}


public class Static_applications {
    public static void main(String[] args) {

        farmer f1 = new farmer();
          farmer f2 = new farmer();
          f1.input();
          f1.compute();
          f1.disp();

           f2.input();
          f2.compute();
          f2.disp();
        
        



        
    }

    
}
