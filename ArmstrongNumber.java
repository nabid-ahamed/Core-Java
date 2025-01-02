/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopprogram;

import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,sum=0,reminder;
        System.out.println("Enter any number: ");
        num=input.nextInt();
        int numofvalue=String.valueOf(num).length();
        int tem=num;
        while(num!=0)
        {
            reminder=num%10;
            sum=sum +(int)Math.pow(reminder,numofvalue);
            num=num/10;
        }
        if (tem==sum)
            System.out.println("Armstrong Number");
        else    
            System.out.println("Not Armstrong Number");
        
    }
    
}
