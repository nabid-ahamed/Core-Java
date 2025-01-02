
package pattern;


public class Patter1 {
    public static void main(String[] args){
       int row,col;
        for ( row = 1; row <=5; row++) {
            for ( col = 1; col <=row; col++) {
                System.out.print("  # ");
                
               
            }
            System.out.print("\n");
        }
        for ( row = 5; row >=1; row--) {
            for ( col = 1; col <=row-1; col++) {
                System.out.print("  # ");
                
               
            }
            System.out.print("\n");
        }
    }
       
    
}
