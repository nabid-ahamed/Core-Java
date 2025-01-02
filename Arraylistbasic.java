
package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Arraylistbasic {
    public static void main(String[]args){
        ArrayList<Integer> arrl=new ArrayList<>();
        System.out.println(arrl.size());
        arrl.add(10);
       
        arrl.add(0, 512);
        arrl.add(1,15);
        arrl.add(105);
        arrl.add(4,205);
        System.out.println(arrl);
        Collections.sort(arrl);
        
        for (int i :arrl) {
            System.out.println(i);
        }
        arrl.remove(2);
         System.out.println(arrl.size());
         arrl.clear();
         System.out.println(arrl.isEmpty());
    }
    
}
