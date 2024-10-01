import java.io.File;
import java.io.IOException;

public class More_in_File08 {
    public static void main(String[] args) throws IOException {
        
        File dir=  new File("Ishi");
     //  System.out.println(dir.isDirectory());
        dir.mkdir(); 
        System.out.println("dir is refering to directory  Ishi : " + dir.isDirectory());
        

         File file1 = new File(dir , "Him");
         file1.createNewFile(); 
         //System.out.println(file1.isFile());
  System.out.println("File  is refering to directory  Him :  " + file1.isFile());

//  how to check how many file are in directory 

        int count = 0 ;
   File f = new File( "Him");

   String str[] = f.list();

   for( String name : str ){
    count ++ ;
    System.out.println(name);

   }

   System.out.println("No of Files are " + count);
        
    }
    
}
