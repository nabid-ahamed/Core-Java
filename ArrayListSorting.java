
package arraylist;

import java.util.*;


public class ArrayListSorting {
    public static void main(String[] args) {
        String a="Nabid";
        System.out.println(a.charAt(4));
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> number=new ArrayList<>();
        System.out.print("Enter how many Data you want add : ");
        int num=input.nextInt();
        for (int i =0 ; i <num; i++) {
                 number.add(i,input.nextInt());
                 System.out.println("");
        }
        System.out.println(number);
        Collections.sort(number);
        System.out.println("After Sorting:"+number);
        Collections.sort(number.reversed());
        System.out.println("De"+number);
    }
    
}
