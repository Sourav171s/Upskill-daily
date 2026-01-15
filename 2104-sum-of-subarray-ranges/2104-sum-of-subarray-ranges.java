class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long total=0;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int max=nums[i];
            for(int j=i;j<n;j++){
                min=Math.min(nums[j],min);
                max=Math.max(nums[j],max);
                total+=(max-min);
            }
        }
        return total;
    }
}