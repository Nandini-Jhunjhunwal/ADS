import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {

        String s = "aabac";
        int k = 2;

        int left = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
        }

        System.out.println(max);
    }
}