class Example implements Runnable{
    public void run(){
        for(int i =0 ; i<3 ; i++){
                   System.out.println("Focus is important ");
                   try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                   System.out.println("Thread is Intrupted ");
                }
        }
    }
}


public class interrupt_method11 {
    public static void main(String[] args) {
        Example e = new Example() ;
        Thread t1 = new Thread(e);
        t1.start();
        t1.interrupt();

    }
    
}
