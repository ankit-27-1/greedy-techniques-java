public class file6 {
    static int kLargest(int l,int r,int k){
        l=Math.max(l,0);
        int p=-1;
        for(int i=l;i<=r;i++){
            if(i%2!=0){
                p++;
            }
            if(p==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(kLargest(-3,3,1));
    }
}
