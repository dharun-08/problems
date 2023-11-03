package zoho;

/**
 * multiplyChar
 */
public class multiplyChar {

    public static void main(String[] args) {
        String str = "a1b10";
        StringBuilder sb = new StringBuilder();
        int i=0;
        int length = str.length();
        while(i<length){
            char currentChar = str.charAt(i);i++;
            if(i<length&&Character.isDigit(str.charAt(i))){
                int count = 0;
                while (i<length&&Character.isDigit(str.charAt(i))) {
                    count = count*10+Character.getNumericValue(str.charAt(i));
                    i++;
                }
                for(int k=0;k<count;k++){
                    sb.append(currentChar);
                }
            }else{
                sb.append(currentChar);
            }
        }
        System.out.println(sb.toString());
    }
}