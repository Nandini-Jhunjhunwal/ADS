class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;

        int odd = 0;     // count of odd prefix sums
        int even = 1;    // empty prefix sum is even
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (sum % 2 == 0) {
                count = (count + odd) % MOD;
                even++;
            } else {
                count = (count + even) % MOD;
                odd++;
            }
        }

        return count;
    }
}
