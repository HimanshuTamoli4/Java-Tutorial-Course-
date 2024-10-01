import java.util.Scanner;

class calc implements Runnable{
    public void run() {
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
}

class Message implements Runnable {
    public void run() {

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


public class Creating_Threads_by_implementing_Runnable_interface05 {
    public static void main(String[] args) {
        
System.out.println("Main Thread ");

calc c1 = new calc() ;
Message  m1 = new Message();
Thread t1 = new Thread(c1);
Thread t2 = new Thread(m1);

t1.start();
t2.start();



    }
    
}
