import java.util.Scanner;

public class PermutationInString567 {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];

        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            freq[s2.charAt(right) - 'a']--;

            if (right - left + 1 > s1.length()) {
                freq[s2.charAt(left) - 'a']++;
                left++;
            }

            if (isZero(freq)) return true;
        }

        return false;
    }

    private static boolean isZero(int[] freq) {
        for (int x : freq) {
            if (x != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter s2: ");
        String s2 = sc.nextLine();

        boolean result = checkInclusion(s1, s2);

        System.out.println("Result: " + result);

        sc.close();
    }
}
