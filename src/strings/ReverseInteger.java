package strings;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {

        int rev = 0;
        while (x != 0) {
            int digit = x % 10;

            // Check BEFORE multiplying by 10
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10) {
                return 0;
            }

            rev = rev * 10 + digit;
            x = x / 10;
        }

        return rev;
    }
}
