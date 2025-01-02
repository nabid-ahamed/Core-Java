/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopprogram;

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int value,sum = 0;
        System.out.printf("Enter the the range you want to see 1 to ");
        value=input.nextInt();
        
        for(int i=1;i<=value;i++)
        {
            if(i==5)
                break;
            System.out.println(i);
            
            
        }
        
        
    }
    
}
