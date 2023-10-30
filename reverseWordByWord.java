import java.util.Arrays;

/**
 * reverseWordByWord
 */
public class reverseWordByWord {

    public static void main(String[] args) {
        char[] array = {'o','n','e',' ','t','w','o',' ','T','h','r','e','e'};
        int length = array.length;
        int i=0;
        int j = length-1;
        while(i<j){
            char c = array[i];
            array[i] = array[j];
            array[j] = c;
            i++;
            j--;
        }
        int k = 0;
        int  count = 0;
        int l = 0;
        for( k=0;k<length;k++){
            if(array[k]!=' '){
                count++;
            }else{
                l = k;
                int start =count-k;
                int end = k-1;
                while(start<end){
                    char c = array[start];
            array[start] = array[end];
            array[end] = c;
            start++;
            end--;
                }
                count=0;
            }
        }
        int s = l+1;
        int e = k-1;
        while(s<e){
                    char c = array[s];
            array[s] = array[e];
            array[e] = c;
            s++;
            e--;
                }
        System.out.print(Arrays.toString(array));
        
    }
}