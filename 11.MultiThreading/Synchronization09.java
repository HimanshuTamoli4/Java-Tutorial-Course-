//  Declaring method as synchronize  ==>

// class car implements Runnable {
//   synchronized  public void run() {
//         try {
//             System.out.println(Thread.currentThread().getName() + " has entered the parking lot ");
//             Thread.sleep(2000);
//             System.err.println(Thread.currentThread().getName() + " got into car to drive ");
//             Thread.sleep(2000);
//             System.err.println(Thread.currentThread().getName() + " Started to drive the car  ");
//             Thread.sleep(2000);
//             System.err.println(Thread.currentThread().getName() + " come back and parked the car  ");
//             Thread.sleep(2000);

//         } catch (Exception e) {
//             System.out.println("Some Problem");
//         }
//     }
// }

//  Declaring block as synchronize ==> 

class car implements Runnable {
   public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " has entered the parking lot ");
            Thread.sleep(2000);
            synchronized(this){
                 System.err.println(Thread.currentThread().getName() + " got into car to drive ");
            Thread.sleep(2000);
            System.err.println(Thread.currentThread().getName() + " Started to drive the car  ");
            Thread.sleep(2000);
            System.err.println(Thread.currentThread().getName() + " come back and parked the car  ");
            Thread.sleep(2000);
            }

           

        } catch (Exception e) {
            System.out.println("Some Problem");
        }
    }
}

public class Synchronization09 {
    public static void main(String[] args) {
        car c = new car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("Ishita");
        t2.setName("Himanshu");
        t3.setName("Anshika");

        t1.start();
           t2.start();
           t3.start();

    }

}
