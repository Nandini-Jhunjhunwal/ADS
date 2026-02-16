public class SplitArray {
    public static void main(String[] args) {
        int[]arr={1,3,4,-1,-5,2,6,0};
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        if(totalSum%3!=0){
            System.out.println(false);
            return;
    }
    int partSum=totalSum/3;
    int currentSum=0;
    int count=0;
    for(int i=0; i<arr.length;i++){
        currentSum+=arr[i];
        if(currentSum==partSum){
            count++;
            currentSum=0;
        }
    }
    System.out.println(count>=3);
    }
}
