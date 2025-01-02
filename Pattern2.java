
package pattern;

import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.print("Enter character : ");
        ch=input.next().charAt(0);
        ch=Character.toUpperCase(ch);
        for (char i = 'A'; i <=ch; i++) {
            if( (i-'A')%2==0){
            for (char j = 'A'; j <=i; j++) {
                System.out.print(i+" ");
                
            }
            
           
            }else
            {
                for (char j = 'A'; j <=i; j++) {
                System.out.print("0 ");
                
            }
            }
            
            System.out.print("\n");
            
        }
        
    }
    
}
