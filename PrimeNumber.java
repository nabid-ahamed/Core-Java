
package loopprogram;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,count=0,initial,last,numofprime=0,sum=0;
        System.out.print("Enter the initial number : ");
        initial=input.nextInt();
        System.out.print("Enter the last number : ");
        last=input.nextInt();
        
        for(int j=initial;j<=last;j++)
        {
            count=0;
        
        if(j<=1)
        {
            count++;
        }
        else
        {
            for (int i = 2; i <=Math.sqrt(j); i++) 
            {
                if(j%i==0)
                {
                    count++;
                    break;
                }
                
            }
        }
        if(count==0)
        {
            System.out.println(j);
            numofprime++;
            sum=sum+j;
            
            
        }
        
        }
        System.out.println("Number of prime: "+numofprime);
        System.out.println("sum : "+sum);
        
    }
    
}
