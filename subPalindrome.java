import java.util.*;
// import java.io.*;

/**
 * subPalindrome
 */
public class subPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "tenet";
        int count = 0;
        List<String> palin = new ArrayList<>();
        //tenet
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String sub = str.substring(i, j+1);
                palin.add(sub);
            }
        }
        for(String ss : palin){
            String rev = "";
            for(int k = ss.length()-1;k>=0;k--){
                 rev =  rev+ss.charAt(k);
                 if(rev.equals(ss)&&ss.length()>1){
                    count++;
                 }
            }
        }
        System.out.print(count);
        sc.close();
    }
    
}