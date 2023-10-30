public class invertedHalfPyramid {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        for(int i=0;i<row;i++){
            for(int j=i;j<column;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
