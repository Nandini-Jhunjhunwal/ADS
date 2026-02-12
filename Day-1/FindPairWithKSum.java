public class FindPairWithKSum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,6};
        int target=6;
        int left=0;
        int right=arr.length-1;
        boolean found=false;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                found=true;
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
    }
    System.out.println(found);
}
}