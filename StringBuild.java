/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

/**
 *
 * @author hp
 */
public class StringBuild {
    public static void main(String[] args) {
        String st="Nabid";
        StringBuilder ob=new StringBuilder(st);
        System.out.println(ob);
        ob.append(" Ahamed ");
        System.out.println(ob);
        ob.delete(0, 05);
        System.out.println(ob);
       
        System.out.println( ob.toString().trim());
    }
}
