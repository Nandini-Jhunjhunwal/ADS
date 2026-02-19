import java.util.Scanner;

public class RansomNote383 {

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] freq = new int[26];

            for (char c : magazine.toCharArray()) {
                freq[c - 'a']++;
            }

            for (char c : ransomNote.toCharArray()) {
                if (freq[c - 'a'] == 0) return false;
                freq[c - 'a']--;
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter ransom note string: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine string: ");
        String magazine = sc.nextLine();

        boolean result = sol.canConstruct(ransomNote, magazine);

        System.out.println("Result: " + result);

        sc.close();
    }
}
