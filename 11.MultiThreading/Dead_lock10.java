class Library implements Runnable {
    String res1 = new String("Java");
    String res2 = new String("SQL");
    String res3 = new String("DSA");

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Student1")) {
            try {
                Thread.sleep(3000);
                synchronized (res1) {
                    System.out.println("Student1 has accuired " + res1);
                    synchronized (res2) {
                        System.out.println("Student1 has accuired " + res2);
                        synchronized (res3) {
                            System.out.println("Student1 has accuired " + res3);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some Problem ");
            }

        } else {
            try {
                Thread.sleep(3000);
                synchronized (res3) {
                    System.out.println("Student1 has accuired " + res3);
                    synchronized (res2) {
                        System.out.println("Student1 has accuired " + res2);
                        synchronized (res1) {
                            System.out.println("Student1 has accuired " + res1);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Some Problem ");
            }

        }
    }

}

public class Dead_lock10 {
    public static void main(String[] args) {
        Library lib = new Library();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();

    }
}
