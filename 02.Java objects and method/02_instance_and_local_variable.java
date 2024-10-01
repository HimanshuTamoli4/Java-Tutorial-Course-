class test {
   
    int a = 8;    // a and name are the instance variavle 
   String name = "Ishita" ;
    public static void main(String[] args) {
       // step 1-   declare the varfiable  
       // step 2-   create the object
        int num = 9 ; // primitive      ======> num and obj are local variable 
       test  obj1 =  new test() ; // refrence
  test  obj2 =  new test() ;
  obj2.name = "Himanshu";
       System.out.println(obj1.name);
        System.out.println(obj1.a);
            System.out.println(obj2.name);
    }

}