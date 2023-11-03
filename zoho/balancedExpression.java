package zoho;
class balancedExpression {
    public static void main(String[] args) {
        String str = "(((a+b))";
        int balanced = 0;
        boolean isValid = true;

        for (char c : str.toCharArray()) {
            if (c == '(') {
                balanced++;
            } else if (c == ')') {
                balanced--;
                if (balanced < 0) {
                    isValid = false; // Unbalanced closing parenthesis
                    break;
                }
            } else if (c == '+' || c == '-' || c == '*') {
                if (!Character.isLetterOrDigit(str.charAt(str.indexOf(c) - 1)) ||
                    !Character.isLetterOrDigit(str.charAt(str.indexOf(c) + 1))) {
                    isValid = false; // Invalid operator placement
                    break;
                }
            }
        }
        System.out.println(balanced);
        if (balanced != 0 || !isValid) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
