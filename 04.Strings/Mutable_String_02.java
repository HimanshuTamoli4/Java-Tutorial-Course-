public class Mutable_String_02 {
    public static void main(String[] args) {
        
        StringBuffer  s1 = new StringBuffer();
         StringBuilder  s2 = new StringBuilder();

        System.out.println(s1.capacity());

         System.out.println(s2.capacity());

         s1.append("abcdefghijklmnop") ;
              s1.append("a") ;

         System.out.println(s1.capacity());  //  capacity =>  How many characters you can keep 
         
         System.out.println(s1.length());  //  capacity =>  How many characters present in string


         //  #### More inbuilt methods 


         StringBuffer sb1 = new StringBuffer("Ishita");

        System.out.println(sb1);
        
        System.out.println(sb1.capacity());
         System.out.println(sb1.charAt(1));
          System.out.println(sb1.capacity());
          sb1.setCharAt(1, 'h');
          System.out.println(sb1);


          StringBuilder sb2 = new StringBuilder(150) ; // -->   when you pass number in StringBuilder it will be it capacity
        System.out.println(sb2.capacity());
        
        sb2.append("Ishi");
             System.out.println(sb2.capacity());
                System.out.println(sb2);
                sb2.trimToSize();  // --. it will reduce the capacity into no of cuurenly present elements in string
            System.out.println(sb2.capacity() );
           

        StringBuilder s3 = new StringBuilder("Ishita");
        System.out.println(s3);
        s3.reverse(); // --> This  metho will reverse the whole string 
        System.out.println(s3);
        s3.replace(0, 2, "Him");  // --> This method will replace the words in the string 
         System.out.println(s3); 
        







    }
    
}
 

// Important notes ==>  1. Intial capacity = 16 
//                      2. New capacity = {Old capacity + 1} * 2