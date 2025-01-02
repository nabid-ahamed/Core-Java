
package inheritancepractice;

class Animal{
   
String name="Pappy";
}
class Dog extends Animal{
    void bark(){
        System.out.println("The Dog can Bark");
    }
}
    class Cat extends Dog{
        String hAve(){
            return "Cat can give birth";
        }
    }

public class SingleInheritance {
    public static void main(String[] args) {
        
        Cat ob=new Cat();
        ob.bark();
        
        System.out.println(ob.hAve());
        System.out.println("The name is "+ob.name);
    }
    
}
