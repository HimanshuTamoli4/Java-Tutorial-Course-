// Jaggged arrays ==> Jagged arrys are the arrays in which no of raws are fixed but no of columns are not fixed it varries 

public class Jagged_arrows {
    public static void main(String[] args) {
        
        
    
     // int nums[][] = new int[3][] ;
    //  nums[0] = new int[4] ;
    //    nums[1] = new int[2] ;
    //      nums[2] = new int[3] ;
      // nums[0][0] = 1 ;
        // nums[0][1] = 2 ;
        // nums[1][0] = 1 ;
        // nums[1][1] = 1 ;
        // nums[2][0] = 1 ;
        // nums[0][1] = 1 ;
        
        int nums[][] = { {1,2,3,4} , 
                         {3,4} , 
                        {4,7,7}
                                 };

        for(int i = 0 ; i<=2 ; i++){
            for(int j=0 ; j<nums[i].length ; j++){
                System.out.print(nums[i][j] + " ");
            }
                System.out.println();

        }
   }
}

