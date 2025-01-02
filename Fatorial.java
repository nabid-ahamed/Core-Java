/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopprogram;

/**
 *
 * @author hp
 */import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,fact=1;
        System.out.println("Enter the number : ");
        number=input.nextInt();
        number=Math.abs(number);
        for (int i = 1; i <=number; i++) {
            fact=fact*i;
            
        }
        System.out.printf("Factorial of %d is : %d\n",number,fact);
        
    }
    
}
