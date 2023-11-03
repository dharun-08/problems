public class invertedPyramidPat {
    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        for(int i=0;i<row;i++){
            for(int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<column;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
