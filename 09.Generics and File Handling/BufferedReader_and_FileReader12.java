import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReader_and_FileReader12 {
    public static void main(String[] args) throws Exception {
        File dir = new File("pw");
        File file1 = new File(dir, "Pw.txt");
        FileReader fr = new FileReader(file1);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line!= null){
            System.err.println(line);
            line = br.readLine();

        }
        System.out.println(br);

    }

}
