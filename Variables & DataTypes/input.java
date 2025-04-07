import java.util.*;
public class input{
    public static void main(String args[]){
       
        //Input for any one word
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("You entered : "+input);
    
        //Input for any sentence
        Scanner ac = new Scanner(System.in);
        String strings = ac.nextLine();
        System.out.println("You entered : "+strings);
    
        //Input for Integer value
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        System.out.println("You entered : "+number);
    
         //Input for Integer value
         Scanner nums = new Scanner(System.in);
         float numbers = nums.nextFloat();
         System.out.println("You entered : "+numbers);
    
    }
}







// import java.util.*;
// public class input {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         // String input = sc.next();              // this next takes only one word as a string
//         // System.out.println(input);
       
//         // String input = sc.nextLine();             // this nextLine takes as many words as a string
//         // System.out.println(input);

//         int number = sc.nextInt();                  //this nextInt takes integer value from user
//         System.out.println("The number you entered is :",number);

//     }
// }
