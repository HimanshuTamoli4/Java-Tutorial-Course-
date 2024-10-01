public class Final_keyword_in_Mutable_string {
public static void main(String[] args) {
    
// final int a = 10 ;  //  now a becomes constant its value can notbe chnaged 
// a = 20 ; 
// System.out.println(a);

StringBuffer s1 = new StringBuffer("Ishita");
s1.append(" Chauhan");
System.out.println(s1);
s1 =  new StringBuffer("Anshika");
 System.out.println(s1);

final StringBuffer s2 = new StringBuffer("Himanshu");
s2.append(" Tamoli");
System.out.println(s1);
// s2 =  new StringBuffer("Chauhan ");   //   now s2 will nt update because of final keyword we can do operation in final string buffer s1 but we can not vhange its adrres to hold a new string 
 System.out.println(s2);

// Note --> Final keyword doesn't change the mutability of stringbuffer and  string builder it does not make it mutable to nmutabble it only affect of reference variable








}
}
