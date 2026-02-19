import java.util.Scanner;
import java.util.Arrays;

public class ReverseString344 {

    static class Solution {
        public void reverseString(char[] s) {
            int l = 0, r = s.length - 1;

            while (l < r) {
                char temp = s[l];
                s[l] = s[r];
                s[r] = temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        sol.reverseString(arr);

        System.out.println("Reversed string: " + Arrays.toString(arr));

        sc.close();
    }
}
