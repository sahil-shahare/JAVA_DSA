public class leetCode {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        int rev = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10;

        }
        System.out.println(original);
        System.out.println(rev);
        if (original == rev) {
            return true;
        }
        return false;
    }

}
