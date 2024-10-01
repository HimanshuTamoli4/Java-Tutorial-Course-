class calc{
    public int add( int nums[]){
        int res = 0 ;
        for(int i = 0 ; i<nums.length ; i ++){
            res = res + nums[i];
        }
        return res ;
    }
}



public class Anonymous_array {
    public static void main(String[] args) {
        int nums[] = {5,4,8,6};
        calc obj = new calc() ; 
       // int result = obj.add(nums);  //  insttead of it we can write it as below 
         int result = obj.add(new int[]{5,4,8,6}); // ==> now {5,4,8,6} is a anonoymous array it do not have a name it can be used only at once time 

        System.out.println("The result of adding arrays elements is " + result);
    }
    
}
