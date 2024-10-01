// In heap area  uolicates are allowed 
// but in string conctant pool area duplicates are not allowed


public class Compare_string {
    public static void main(String[] args) {
        String s1 = "Ishita";
         String s2 = new String("Ishita");
        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));

        // String s3 = "Ishita";
        // String s4 = "Ishita";
        // String s5 = "ishita";
        // System.out.println(s3==s4);
        //   System.out.println(s3==s5);
        //      System.out.println(s3.equals(s4));
        //      System.out.println(s3.equals(s5));
             
         String s6 = new String("ishita");
         System.out.println(s1==s6);
         System.out.println(s2==s6);
         System.out.println(s1.equalsIgnoreCase(s6));  // equalsignorecase compare two strings by ignoring it is upper case and lowercase 
          System.out.println(s2.equals(s6));

        
    }
    
}
