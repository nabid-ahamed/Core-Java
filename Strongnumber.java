
package loopprogram;

import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int first,second,reminder,sum=0,fact,tem,c=0;
        System.out.println("Enter the first number : ");
        first=input.nextInt();
        System.out.println("Enter the second number : ");
        second=input.nextInt();
          
        for (int i = first; i <=second; i++) {
            
        
         tem=i;
        
        sum=0;
         
        while(i!=0)
        {
            reminder=i%10;
            fact=1;
            
           
            for (int j = 1; j <=reminder; j++) {
                
                fact=fact*j;
                
            }
            sum=sum+fact;
            i=i/10;
            
        }
        if(tem==sum)
        {
            c++;
            System.out.println(i);
        }
        
        
    }
      
        System.out.println(c);
    
}
}
