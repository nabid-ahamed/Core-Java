/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticblock;
class Demo{
    static String a;
    static{
        a="Nabid";
        System.out.println(a);
       
    }
    static void display(){
        System.out.println(a);
        
    }
}


public class StaticBlock {

    
    public static void main(String[] args) {
        Demo.display();
       
    }
    
}
