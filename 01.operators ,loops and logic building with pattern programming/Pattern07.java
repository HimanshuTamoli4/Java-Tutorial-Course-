// wap to print this pattern

// *        *
//  *      *
//   *    *
//    *  *
//     **
//     **
//    *  *
//   *    *
//  *      *
// *        *



public class Pattern07 {
     public static void main(String[] args) {
        int n = 10 ;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                if( i==j || i+j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    
}

}