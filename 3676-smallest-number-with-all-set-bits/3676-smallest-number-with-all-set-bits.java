class Solution {
    public int smallestNumber(int n) {
        int i=1;
        int ans=(int)Math.pow(2,i)-1;
        while(ans<n){
            i++;
            ans=(int)Math.pow(2,i)-1;
        }
        return ans;
    }
}