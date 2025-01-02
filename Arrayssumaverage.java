
package array;

import java.util.Scanner;
public class Arrayssumaverage {
    public static void main ( String[] args){
        Scanner input=new Scanner(System.in);
        int i,sum=0,max;
        System.out.print("Enter the array Size : ");
        i=input.nextInt();
        int[] arrys=new int[i];
        for (int j = 0; j < i; j++) {
            System.out.printf("Number [%d]= ",j);
            arrys[j]=input.nextInt();
            
        }
        max=arrys[0];       
        for (int j = 0; j < i-1; j++) {
                    if(arrys[j+1]>max ){
                        max=arrys[j];
                    }
                    
            
        }
                System.out.println("Maximum Number : "+ max );
        
    }
    
}
