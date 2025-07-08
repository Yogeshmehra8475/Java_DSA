import java.util.*;
public class continueInLoop {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
        do{
           
            System.out.print("Enter the number : ");
            int number = sc.nextInt();

            if(number % 10 == 0){
                continue;
                
            }
            System.out.println("The Number you enter is : "+number);
        }while(true);

    }
}
