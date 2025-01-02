
package array;

import java.util.Scanner;
public class Mattrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] matrix=new int [3][3];
        int sum=0;
        //taking input
        for (int row  = 0; row<=2; row++) {
        for (int col = 0; col <=2; col++) {
            System.out.print("Index ["+row+"]["+col+"]=");
            matrix[row][col]=input.nextInt();
        }
            
        }
        for (int row  = 0; row<=2; row++) {
        for (int col = 0; col <=2; col++) {
            System.out.print(matrix[row][col]+" ");
            
        }
            System.out.println(" ");
            
        }
        for (int row  = 0; row<=2; row++) {
        for (int col = 0; col <=2; col++) {
           if(row==col)
           {
               sum=sum+matrix[row][col];
               
           }
           
        }
            
        }
        System.out.println(sum);
        
    }
    
}
