import java.util.Scanner;

public class ValidPalindrome125 {

    static class Solution {
        public boolean isPalindrome(String s) {
            int l = 0;
            int r = s.length() - 1;

            while (l < r) {
                while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                    l++;
                }

                while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                    r--;
                }

                if (Character.toLowerCase(s.charAt(l)) !=
                    Character.toLowerCase(s.charAt(r))) {
                    return false;
                }

                l++;
                r--;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        boolean result = sol.isPalindrome(input);

        System.out.println("Result: " + result);

        sc.close();
    }
}
