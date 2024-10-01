class demo1  implements Runnable
{
    public void run(){
        System.out.println("Child Thread Exeuting ");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println("some Problem ");
        }
        System.err.println("Child Thread Task Completed ");
    }
}

public class States_of_Thread07 {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        demo1 d = new demo1();
        Thread t1 = new Thread(d);
        t1.start();

    }
}
