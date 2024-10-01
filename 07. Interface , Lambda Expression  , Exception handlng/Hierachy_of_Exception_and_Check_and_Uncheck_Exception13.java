import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hierachy_of_Exception_and_Check_and_Uncheck_Exception13 {
    public static void main(String[] args) {
        // int result = 8/2 ; // --> it is a uncheecked exception it do not show error because it is checked at run time 
        // System.out.println(result);

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in ));
        // String str = br.readLine(); //  --> t is a cheecked exception this will throw the error because this can checked the error but we are not handling it and it is checked at compile time
                                
        try{

            String str = br.readLine();
            System.out.println(str); 
        }
        catch(Exception e){
            System.out.println("Error..!" + e );
        }

    }
    
}
