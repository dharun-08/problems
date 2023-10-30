public class slidingWindow {
    public static void main(String[] args) {
        int array[] = {12,34,-3,90,-6};
        int k = 3;
        int wcount = 0;
        int mcount = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wcount = wcount+array[i];
        }
        for(int i=k;i<array.length;i++){
            wcount = wcount - array[i-k] + array[i];
            mcount = Math.max(mcount, wcount);
        }
        System.out.print(mcount);
    }
}
