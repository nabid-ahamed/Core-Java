
package array;
import java.util.Scanner;


public class Array1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size=input.nextInt();
        int [] number=new int[size];
        for (int i = 0; i < size; i++) {
            number[i]=input.nextInt();
            
        }
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
            
        }
       
    }
    
}
