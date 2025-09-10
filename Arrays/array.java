import java.util.*;
public class array {
    public static void main(String[] args) {

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

    // Input in Array
    System.out.print("Enter the marks of Physics: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
       marks[1] = sc.nextInt();
       System.out.print("Enter tyhe marks of Maths:");
       marks[2] = sc.nextInt();

       //Output in Array
         System.out.println("The marks of Physics is: " + marks[0]);
        System.out.println("The marks of Chemistry is: " + marks[1]);
        System.out.println("The marks of Maths is: " + marks[2]);

        //Updating the marks
        marks [2] = marks[2] + 2;
        System.out.println("New Updated marks of Maths is :" + marks[2]);
          
          //Or
          marks [1]= 99;
          System.out.println("New Updated marks of Chemistry is :" + marks[1]);
    }
}
