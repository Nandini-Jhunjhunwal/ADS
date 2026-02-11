public class VariableSize {
    public static void main(String[] args) {
        int[]arr={2,1,5,1,3};
        int k=7;
        int left=0;
        int sum=0;
        int maxLen=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            maxLen=Math.max(maxLen, right-left+1);
        }
        System.out.println(maxLen);
    }
}
