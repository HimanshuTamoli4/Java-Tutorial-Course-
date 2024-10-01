import java.io.* ;

class Cricketer implements Serializable {
     String name ;
    transient int age ;
     int runs ;
    public Cricketer(String name , int age , int runs ){
        this.age = age ;
        this.name = name ;
        this.runs = runs ;
      
    }

   public void disp(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
      }
    }

public class Selective_Serialization16 {
    public static void main(String[] args) throws Exception {
            // Cricketer c = new Cricketer("Ishita ", 30 , 45699875);
            // c.disp();
    //     FileOutputStream fos = new FileOutputStream("pw.txt");
    //      BufferedOutputStream bos = new BufferedOutputStream(fos);
    //     ObjectOutputStream oos = new ObjectOutputStream(bos); 
    //   oos.writeObject(c);
    //     oos.flush();
    //     oos.close();

         FileInputStream fis = new FileInputStream("pw.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();
        cr.disp();
        ois.close();

        
    }
}
