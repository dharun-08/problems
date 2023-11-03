
public class lenOfString {
    public static void main(String[] args) {
        String str = "lengthofstring";
        System.out.print(LengthOfString(str));
    }
    private static int LengthOfString(String s){
        int length = 0;
        for(int i=0;i<s.length();i++){
            length++;
        }
        return length;
    }
}
