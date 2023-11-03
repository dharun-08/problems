package zoho;

/**
 * oddPositionSort
 */
public class oddPositionSort {

    public static void main(String[] args) {    
        int array[] = {1,2,3,4,5,6,7,8,9};
        int n = array.length;
        for(int i=0;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(array[i]<array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i=1;i<n;i+=2){
            for(int j=i+2;j<n;j+=2){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i:array){
            System.out.print(i+" ");
        }
    }
}