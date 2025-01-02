
package pattern;


public class Pattern3 {
    public static void main(String[] args){
       int row,col;
        for ( row = 1; row <=3; row++) {
            for (int i = 1; i <=3-row; i++) {
                    System.out.print("  ");
                    
                }
            for ( col = 1; col <=row; col++) {
                
                
                System.out.print(col+" ");
                
               
            }
            System.out.println();
        }
        for ( row = 2; row >=1; row--) {
            for (int i = 1; i <=3-row; i++) {
                    System.out.print("  ");
                    
                }
            for ( col = 1; col <=row; col++) {
                
                
                System.out.print(col+" ");
                
               
            }
            System.out.println();
        }
        
    }
       
    
}
