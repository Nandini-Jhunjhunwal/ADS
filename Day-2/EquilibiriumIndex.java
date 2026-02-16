public class EquilibiriumIndex {
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10};
        int n=arr.length;
        int[]prefix=new int[n];
        int[]suffix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            int leftSum=(i==0)?0:prefix[i-1];
            int rightSum=(i==n-1)?0:suffix[i+1];
            if(leftSum==rightSum){
                System.out.println("Equilibrium Index ="+i);
                return;
            }
    }
        System.out.println("No Equilibrium Found");
    }
}
