public class Kadane {
    public static void main(String[] args) {
        int[]arr={2,4,6,-5,8,9,10};
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1; i<arr.length; i++){
            currentSum=Math.max(arr[i], currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("maximum Subarray sum is "+maxSum);
    }
}
