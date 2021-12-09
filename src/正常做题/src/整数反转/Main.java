package 整数反转;

/**
 * @author : Jayleonc
 * @date : 2021-12-06 21:55
 */
public class Main {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            if (rev < Integer.MIN_VALUE / 10 || rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int d = x % 10;
            x /= 10;
            rev = rev * 10 + d;
        }
        return rev;
    }

    public static void main(String[] args) {
        int x = 1233333;
        int reverse = reverse(x);
        System.out.println(reverse);
    }
}
