/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapperclass;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class AutoboxingDemo {
    public static void main(String[]nabid){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Input : ");
        int a=input.nextInt();
        Integer i=Integer.valueOf(a);
       Integer j=a;
        System.out.println(a+" "+i+" "+j);
        
    }
    
}
