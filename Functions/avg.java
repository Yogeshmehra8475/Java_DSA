import java.util.*;
public class avg {
       public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd number :");
        int c = sc.nextInt();
        System.out.println("Average of the 3 numbers is : "+average(a, b, c));
    }
public static int average(int a, int b, int c){
        return (a+b+c)/3;
}
}