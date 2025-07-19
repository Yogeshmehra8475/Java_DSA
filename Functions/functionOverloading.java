// This is function overloading using Parameters 

// public class functionOverloading {
//     //function to print the sum of 2 numbers
//     public static int sum(int a, int b){
//         return a + b;
//     }

//     //function to print the sum of 3 numbers
//     public static int sum(int a, int b, int c){
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(3 ,5));
//         System.out.println(sum(5, 3, 1 ));
//     }    
// }

public class functionOverloading {
    //function to calculate int sum
    public static int sum(int a, int b){
        return a + b;
    }
    //function to calculate float sum
    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(4.6f, 6.5f));
    }
}