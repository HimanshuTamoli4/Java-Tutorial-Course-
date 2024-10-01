import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

public class DeSerialization15 {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("pw.txt");
      BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Cricketer cr = (Cricketer)ois.readObject();
        cr.disp();
      ois.close();

        
    }
}
