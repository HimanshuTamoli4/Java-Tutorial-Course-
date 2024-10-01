public class Conditonals_sentences {
    public static void main(String[] args) {
    //     int age = 18 ;
    //     if(age >= 18 ){
    //      System.out.println("legal adult ");

    //     }
    //     else{
    //             System.out.println("you are a kid ");

    // }

// int age = 18 ;


// if( age>=18 && age<=60){
//     System.out.println("You are an adult ");
// }

// else if( age>60){
//     System.out.println(" you are an old m an now ");
// } 
// else{
//     System.out.println("you are still is a kid ");
// }

int age = 18 ;

if(age >= 18 && age <= 60 ){
   
    if( age>20 && age <30){
        System.out.println("you are in 20's");
    }
    else if(age>= 30 && age <= 40 ){
        System.out.println("you are in 30's");
    }

    else{
        System.out.println(" you are neither in 20's nor in 30's");
    }

}

else if(age>=60){
    System.out.println(" you are an old man ");
}

else if( age >= 16 && age <= 18){
    System.out.println(" you are in you teen age ");
}   

else{

    System.out.println(" you are still a kid ");
}


    }    
}
