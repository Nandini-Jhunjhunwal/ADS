public class Circular {
    public static void main(String[] args) {
        int[]arr={8,-1,3,4};
        int totalSum=0;
        int maxSum=arr[0], currentMax=arr[0];
        int minSum=arr[0], currentMin=arr[0];
        for(int i=0; i<arr.length; i++){
            totalSum+=arr[i];
            if(i>0){
                currentMax=Math.max(arr[i], currentMax+arr[i]);
                maxSum=Math.max(maxSum,currentMax);
                currentMin=Math.min(arr[i], currentMin+arr[i]);
                minSum=Math.min(minSum,currentMin);
            }
    }
    int circularSum=totalSum-minSum;
    System.out.println("Maximum circular subarray sum is "+Math.max(maxSum, circularSum));
}
}