package zoho;

public class returnPosition {
    public static void main(String[] args) {
        String str = "abacdabvcab";
        String check = "az";
        boolean isValid = false;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==check.charAt(0) && str.charAt(i+1) == check.charAt(1)){
                isValid = true;
            }
        }
        System.out.println(isValid);
    }
}
