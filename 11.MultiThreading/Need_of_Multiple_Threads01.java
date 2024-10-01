import java.util.Scanner;

public class Need_of_Multiple_Threads01 {
    public static void main(String[] args) {
        System.err.println("calculation Task Started ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please ENTER FIRSTNUMBER :");
        int num1 = sc.nextInt();
        System.out.println("Please ENTER 2nd NUMBER :");
        int num2 = sc.nextInt();
        int res = num1 + num2 ;
        System.err.println(res);
        System.out.println("Calculation Task Ended ");

        System.out.println("**********************************************");

        System.out.println("Printing * Task started ");

        for(int i = 0 ; i<4 ; i++){
            System.out.println("*");
        }


        System.out.println("Printing * Task Ended ");

        System.out.println("**********************************************");

        System.out.println("Displaying Important message task");
  for(int i = 0 ; i<4 ; i++){
            System.out.println("Stree Moh Nark ka Dwar Hai Balak ");
        }

        
        System.out.println("Displaying Important message task Ended ");
          System.out.println("**********************************************");

    }
}