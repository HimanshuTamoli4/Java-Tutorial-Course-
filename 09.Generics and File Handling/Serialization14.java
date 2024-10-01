
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable {
    private String name ;
    private int age ;
    private int runs ;
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


public class Serialization14 {
    public static void main(String[] args) throws Exception {
         
        Cricketer c = new Cricketer("Ishita ", 30 , 45699875);

        FileOutputStream fos = new FileOutputStream("pw.txt");
       // BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos  = new ObjectOutputStream(fos);

       // ObjectOutputStream oos1  = new ObjectOutputStream(bos); // --> 2nd way serialization 

        oos.writeObject(c);
        oos.flush();
        oos.close();

        // oos1.writeObject(c);
        // oos1.flush();
        // oos1.close();

   
    }
    
}
