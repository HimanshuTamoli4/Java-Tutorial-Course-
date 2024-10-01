class calc {

public int add(int n1 , int n2){
    int res1 =  n1 + n2 ;
    return res1 ;
}
public int add(int n1 , int n2 , int n3){
    int res2 =  n1 + n2 + n3 ;
    return res2 ;
}

public double add(double n1 , double n2){
    double res3 =  n1 + n2 ;
    return res3 ;
}


}


public class Method_overloading {
    public static void main(String[] args) {
        
   calc obj1 = new calc() ;

      int res1 =   obj1.add(4,3);
        int res2 =   obj1.add(4,3,2);
           double res3 =   obj1.add(4.8,3.4);
        System.out.println(res1);
         System.out.println(res2);
           System.out.println(res3);

    }
    
}
