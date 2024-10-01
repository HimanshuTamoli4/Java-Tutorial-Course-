public class BoundsException {
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        System.out.println(num.length-1);
        System.out.println("bye");
        for(int i = 0 ; i<=num.length-1 ; i++){
            System.out.println(num[i]);
            System.out.println("bye");
        }

        for (int n : num ){
            System.out.println(n);

        }


    }
    
}
