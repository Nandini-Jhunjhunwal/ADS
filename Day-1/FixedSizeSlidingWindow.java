public class FixedSizeSlidingWindow{
    public static void main(String[] args) {
        int arr[] ={1,12,-5,-6,50,3};
        int k=4;

        int windowSum=0;
        for(int i=0;i<arr.length;i++){
            windowSum += arr[i];
        }
        int maxSum=windowSum;

        for(int i=k;i<arr.length;i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        
        double Avg = (double)maxSum/k;
        System.out.println(Avg);
    }
}