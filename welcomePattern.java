import java.util.*;
public class welcomePattern {
    public static void main(String[] args) {
        char array[] = {'w','e','l','c','o','m','e'};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i==j){
                    System.out.print(array[i]);
                }else if(i+j==array.length-1){
                    System.out.print(array[j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
