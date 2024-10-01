import java.util.Scanner;

class calc extends Thread {
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

class Message extends Thread {
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

public class Creating_Multiple_Threads04 {
    public static void main(String[] args) {

System.out.println("Main Thread ");
calc t1 = new calc() ;
Message  t2 = new Message();

t1.start();
t2.start();




    }
}