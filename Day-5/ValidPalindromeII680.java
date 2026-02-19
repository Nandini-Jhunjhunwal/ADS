import java.util.Scanner;

public class ValidPalindromeII680 {

    public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r) ||
                       isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        boolean result = validPalindrome(input);

        System.out.println("Result: " + result);

        sc.close();
    }
}
