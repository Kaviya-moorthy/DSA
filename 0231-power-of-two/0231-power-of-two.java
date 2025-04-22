class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        for(int i=0;i<31;i++){
            int p=(int)Math.pow(2,i);
            if(n==p){
                return true;
            }
        }
        return false;
    }
}