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
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String st;
        System.out.print("Enter the String : ");
        st=input.nextLine();
        StringBuffer ob=new StringBuffer(st);
        ob.reverse();
        if(st.equals(ob.toString()))
        {
            System.out.println("Palindrome");
        }
        
        
    }
    
}
