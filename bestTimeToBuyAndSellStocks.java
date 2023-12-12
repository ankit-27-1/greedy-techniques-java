public class file6 {
    static int bestTime(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]-arr[i]>ans && j>i){
                    ans=arr[j]-arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={7,6,4,3,2,1};
        System.out.println(bestTime(arr));
    }
}
