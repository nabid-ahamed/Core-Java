
package array;

import java.util.Scanner;
public class TwodimensionalArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int i=input.nextInt();
        System.out.print("Enter the column number: ");
        int j=input.nextInt();
        int [][] A=new int[i][j];
        //taking input
        for (int k = 0; k< i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.printf("A[%d][%d] = ",k,l);
                A[k][l]=input.nextInt();
                
            }
            
        }
        //displaying the output
      for (int k = 0; k< i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print(" "+A[k][l]);
                
            }
            System.out.println("\n");
            
            
        }  
    }
    
}
