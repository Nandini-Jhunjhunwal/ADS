import java.util.Scanner;

public class ValidAnagram242 {

    static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            for (char c : t.toCharArray()) {
                freq[c - 'a']--;
            }

            for (int x : freq) {
                if (x != 0) return false;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        boolean result = sol.isAnagram(s, t);

        System.out.println("Result: " + result);

        sc.close();
    }
}
