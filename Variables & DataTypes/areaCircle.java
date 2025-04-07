import java.util.*;
public class areaCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : " );
        int rad = sc.nextInt();

        float area = 3.14f * rad * rad;
        System.out.println("Area of the circle is : "+area);

    }
}
//import java.util.*;
// public class areaCircle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the radius of the circle:");
//         float rad = sc.nextFloat();

//         float area = 3.14f * rad * rad;
//         System.out.printf("The area of the circle is : %.2f",area);
//     }
// }
