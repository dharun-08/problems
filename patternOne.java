/**
 * patternOne
 */
import java.util.*;

public class patternOne {

    public static void main(String[] args) {
        int row = 3;
        int column = 5;
        System.out.println();
        for(int i=0;i<row;i++){
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}