import java.util.*;
public class smallestInArray {
    
    public static int getSmallest (int numbers[]){
        int smallest = Integer.MAX_VALUE;     // +Infinity
        for (int i = 0; i<numbers.length; i++){
            if( smallest > numbers[i]){
                smallest = numbers[i];
            }
        } return smallest;
    } 
    public static void main(String args []){
        int numbers[] = {10, 2, 6, 3, 5};
        System.out.println("Largest Value is : "+getSmallest(numbers));
    }
}
