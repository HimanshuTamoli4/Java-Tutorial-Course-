public class Enhance_for_Loop {
    public static void main(String[] args) {
        
    
    int num[] = {3,4,9,8};
    for(int n : num){
        System.out.println(n);
    }

    int nums[][] = { {1,2,3,4} , 
                     {3,4,2,6} , 
                        {4,5,8,7}
                                    };
                                    
            for(int a[] : nums){
                for(int b : a){
                    System.out.print(b + " ");
                }
                    System.out.println();
    
            }                                                                                                             

} 
}
 

//  enhance for loop can also be used for jagged array