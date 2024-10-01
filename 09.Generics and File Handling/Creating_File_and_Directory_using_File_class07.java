import java.io.*;

public class Creating_File_and_Directory_using_File_class07 {
    public static void main(String[] args) throws Exception  {

        //  *** Creating a FILE 
        File file1 = new File("him.txt");
        System.out.println(file1.exists());

       file1.createNewFile();   // --> creats new FILE
       System.out.println(file1.exists());

       
        //  *** Creating a Directory

        File dir=  new File("Ishi");
          System.out.println(dir.exists());
          dir.mkdir(); // --> creats new directory
           System.out.println(dir.exists());
          
              File dir1=  new File("hjj");
          System.out.println(dir1.exists());
        
    }
    
}
