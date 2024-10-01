public class Stringconcatenation {
    public static void main(String[] args) {
        // String s1 = new String("Ishita");
        // s1 = s1.concat(" Himanshu");
        // System.out.println(s1);

        // String s2 = "Ishita";
        // String s3 = s2.concat("Himanshu");
        // String s4 = new String("Ishita");
        // s4 = s4.concat("Himanshu");
        // System.out.println(s2);
        //   System.out.println(s3);
        //     System.out.println(s4);

        // #### Plus operator ==>

        String s1 = "Ishita";
        String s2 = "Ishita" + "Himanshu";
        String s3 = "Ishita" + "Himanshu" + "Love";
        String s4 = s1 + s2 ;
    System.out.println(s1);
      System.out.println(s2);
        System.out.println(s3);
          System.out.println(s4);
        
        String m1 = "Vit";
        String m2 = "Vit" + 100 + 78 + 56  ;
        String m3 = m2 + 40.99 + 'I' + 'h' ;
         System.out.println(m1);
      System.out.println(m2);
        System.out.println(m3);

        // String r1 = " himanshu"; 
        // r1 = r1.concat(" love ishita" ,  "himanshu") ;  --> can add only one string
        // System.out.println(r1);




    }
    
}


//  Note--> 1. Concate method can only add 1 string into 1 string 
//          2. whereas by plus operator we can concate many strings(no of string ) together 
            // 3. in concate method only string can concatinate into another string
            // 4. where as by plus operator we can concatenate numbers an also other variables and objects which are diffrent data types to string object    