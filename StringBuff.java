/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author hp
 */
public class StringBuff {
    public static void main(String[] args) {
        String st="Nabid";
        StringBuffer ob=new StringBuffer(st);
        System.out.println(ob);
        ob.append(" ahamed");
        
        System.out.println(ob);
        ob.reverse();
        System.out.println(ob);
        ob.deleteCharAt(0);
        System.out.println(ob);
        ob.subSequence(7, 11);
        System.out.println(ob);
    }
    
}
