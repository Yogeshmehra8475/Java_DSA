import java.util.*;
public class largestOfThreeNumbers {
    public static void main(String[] args) {
        // int a = 100;
        // int b = 30;
        // int c = 10;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the vale of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

    if (a >= b && a >= c){
        System.out.println("The larger number is a");
    }
    else if(b > a && b >=c){
        System.out.println("The larger number is b");
    }
    else{
        System.out.println("The larger number is c");
    }
    }
}
