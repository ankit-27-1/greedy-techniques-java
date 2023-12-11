public class file5 {
    static int maxPartitions(String s){
        int n=s.length();
        int l=0;
        int r=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='L'){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="LLRRRLLRRL";
        System.out.println(maxPartitions(s));
    }
}
