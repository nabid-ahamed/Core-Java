/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package loopprogram;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,first=0,second=1,fibo;
        System.out.print("Enter the the number you up to see : ");
        number=input.nextInt();
        
        if( number ==0)
            System.out.println("Invalid Value!!!\nEnter valid value");
        
        for (int i = 1; i <=number; i++) {
            
        
        
         if(i==1)
        {
            fibo=first;
            System.out.print(" "+fibo);
        }
        else if(i==2)
        {
            fibo=second;
            System.out.print("  "+fibo);
        }
        else 
        {
            fibo=first+second;
            System.out.print("  "+fibo+"  ");
            first=second;
            second=fibo;
            
        }
            
        }
        System.out.println();
        
        System.out.println(fibo);
    }
    
}
