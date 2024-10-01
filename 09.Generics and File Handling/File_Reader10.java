import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class File_Reader10 {
    public static void main(String[] args) throws IOException {
          File dir = new File("pw");
          File file1 = new File(dir ,"Pw.txt");

          FileReader fr = new FileReader(file1);
           int i =   fr.read();
        //   System.out.println(i);
        //   System.out.println((char)i);

        //   while(i != -1){  // --> this is not a goood approac of reading the data 
        //     System.out.print(i + " ----->");
        //     System.err.println((char)i);
        //     i = fr.read();
        //   }

        // 2nd way and convenient way of readint the data 

        char ch[] = new char[(int)file1.length()];
        fr.read(ch);

        for(char data : ch){
          //  System.out.println(i + "---->");
            System.out.print(data);
        }
          
    }
    
}
