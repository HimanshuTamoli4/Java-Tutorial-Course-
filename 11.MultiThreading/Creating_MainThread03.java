class MyThread extends Thread{
    public void run()
    {
        System.out.println("Child Thread ");

    }
}


public class Creating_MainThread03 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        MyThread mt = new MyThread();
        mt.start();
       // mt.run();  we always call run method by the start method  









    }
    
}
