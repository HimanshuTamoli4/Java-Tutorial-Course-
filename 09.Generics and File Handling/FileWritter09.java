import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter09 {
    public static void main(String[] args) throws IOException {
        File dir = new File("pw");
        dir.mkdir();
        File file1 = new File(dir ,"Pw.txt");
        file1.createNewFile();
       //  FileWriter fw = new FileWriter(file1); // --> data changed if we passed new data 
       
        FileWriter fw = new FileWriter(file1 ,true); // --> because of true keyword data will  previous data is present and new data added to it 

        fw.write("PW");
        fw.write('\n');
        fw.write(45);
          fw.write('\n');
        fw.write(98);
           fw.write('\n');
        char c[] = {'j' , 'f' , 'i' , 'a'}; 
           fw.write('\n');
        fw.write(c);
        // fw.close();
        fw.flush();

        System.out.println("Open pw.txt to see result ");


    }
    
}
