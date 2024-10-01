import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriter_and_FileWriter11 {
    public static void main(String[] args) throws IOException {
             File dir = new File("pw");
          File file1 = new File(dir ,"Pw.txt");
          FileWriter fw = new FileWriter(file1);
          BufferedWriter bw = new BufferedWriter(fw);

          bw.write("java");
          bw.newLine();
          bw.write(65);
          bw.newLine();
          char ch[ ] = {'I' , 's' , 'h' , 'i'};
          bw.write(ch);
          bw.close();


    }
    
}
