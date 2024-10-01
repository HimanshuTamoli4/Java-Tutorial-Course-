import java.util.Scanner;
class Mythread extends Thread {
    public void run() {
    String name = Thread.currentThread().getName();
    System.out.println(name);
    if(name.equals("Ishita")){

        calc();

    }
    else{
        Message();
    }

    }

    public void calc(){
            System.out.println("calculation Task Started ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please ENTER FIRSTNUMBER :");
        int num1 = sc.nextInt();
        System.out.println("Please ENTER 2nd NUMBER :");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.err.println(res);
        System.out.println("Calculation Task Ended ");

        System.out.println("**********************************************");

    }
    public void Message(){
            System.out.println("Displaying Important message task");
        for (int i = 0; i < 4; i++) {
            System.out.println("Stree Moh Nark ka Dwar Hai Balak ");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
              System.out.println("Some Problem in Programme");
           
            }
        }

        System.out.println("Displaying Important message task Ended ");
        System.out.println("**********************************************");
    }
    

}






public class Multiple_task_within_single_run06 {
    public static void main(String[] args) {
        System.out.println("Main thread Started ");
        Mythread t1  = new Mythread() ; 
        Mythread t2  = new Mythread() ;
        t1.setName("Ishita");
        t2.setName("Himanshu ");

        t1.start();
        t2.start();


        
    }
    
}
