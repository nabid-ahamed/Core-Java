/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapperclass;

/**
 *
 * @author hp
 */
public class Autounboxing {
    public static void main(String[] args) {
        
        Double x=new Double(20.20);
        System.out.println(x);
        double j=x.doubleValue();
        double i=x;
        
        System.out.println(x+" "+j+" "+i);
    }
    
}
