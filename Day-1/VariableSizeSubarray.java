public class VariableSizeSubarray {
    //arr=[2,1,5,1,3]
    //k=7
    // right=0 (add 2): sum=2 (<=7) → maxLength=max(0,0-0+1)=1
    // right=1 (add 1): sum=3 (<=7) → maxLength=max(1,1-0+1)=2
    // right=2 (add 5): sum=8 (>7) → shrink: sum-=arr[0]=2 → sum=6, left=1 → now sum<=7 → maxLength=max(2,2-1+1)=2
    // right=3 (add 1): sum=7 (<=7) → maxLength=max(2,3-1+1)=3
    // right=4 (add 3): sum=10 (>7) → shrink: sum-=arr[1]=1 → sum=9, left=2 ,still >7 → shrink: sum-=arr[2]=5 → sum=4, left=3
    // maxLength=max(3,4-3+1)=3
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3};
        int k = 7;
        int left = 0; int sum = 0; int maxLength = 0;

        for(int right = 0; right < arr.length; right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            maxLength = Math.max(maxLength, right -left+1 );
        }
        System.out.println("Maximum length of subarray with sum at least " + k + " is: " + maxLength);
    }
}