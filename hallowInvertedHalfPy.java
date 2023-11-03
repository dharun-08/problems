/**
 * hallowInvertedHalfPy
 */
public class hallowInvertedHalfPy {
    public static void main(String[] args) {
        int row = 7;
        int column = 7;
        for(int i=0;i<row;i++){
            System.out.print("*");
            for(int j=0;j<column;j++){
                if(i==0){
                    System.out.print("*");
                }
                else if((i+j)==column-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("*");
    }
}