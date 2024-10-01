import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter13 {
    public static void main(String[] args) throws Exception {
        File dir = new File("pw");
        File file1 = new File(dir, "Pw.txt");
        PrintWriter pw = new PrintWriter(file1);
        pw.write(97);
        pw.write("\n");

        pw.write(89);
        pw.write("\n");

        pw.println("Ishi");
        pw.print(100);
        pw.println('I');
        pw.println(18.1);
        pw.println(true);
        pw.close();

    }

}
