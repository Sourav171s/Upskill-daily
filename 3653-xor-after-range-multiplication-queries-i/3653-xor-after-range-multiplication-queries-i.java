class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int max=(int)(1e9+7);
        int n=queries.length;
        int m=nums.length;
        int i=0;
        while(i<n){
            int j=queries[i][0];
            while(j<=queries[i][1]){
                nums[j]=(int)((1L*nums[j]*queries[i][3])%max);
                j+=queries[i][2];
                // System.out.println("j "+ j);
            }
            i++;
            // System.out.println("i "+i);
        }
        int ans=0;
        for(int l=0;l<m;l++){
            ans^=nums[l];
        }        
        return ans;

    }
}