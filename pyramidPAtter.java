public class pyramidPAtter {
    public static void main(String[] args) {
        int row = 6;
        int column = 6;
        for(int i=0;i<row;i++){
            for(int k=row-i;k>1;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
