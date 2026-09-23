public class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
        System.out.println(isBalanced("(()"));
    }

    public static boolean isBalanced(String str) {
    int count = 0;

    for (char ch : str.toCharArray()) {
        if (ch == '(') {
            count++;
        } else if (ch == ')') {
            count--;
            if (count < 0) {
                return false;
            }
        }
    }

    return count == 0;
}
    
}
