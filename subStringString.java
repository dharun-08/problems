public class subStringString {
    public static boolean containsSubstring(String str, String substring) {
        int strLength = str.length();
        int subLength = substring.length();

        for (int i = 0; i <= strLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "sample";
        String s = str+""+str;
        String substring = "mplysa";

        if (containsSubstring(s, substring)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }
}
