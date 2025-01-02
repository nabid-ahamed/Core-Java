/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class StringDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        name=input.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.codePointAt(0));
        String a="     I Love Bangladesh   ";
        System.out.println(a.trim());
       String[]  b= a.split(" ");
        
        for (String x:b) {
            System.out.println(x);
            
        }
    }
}
