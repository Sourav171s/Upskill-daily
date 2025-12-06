class Solution {
    public int singleNumber(int[] nums) {
                        //solution - 1 hashmap waala

                        //solution - 2 better 
        // int ans=0;
        // for(int bit=0;bit<32;bit++){
        //     int cnt=0;
        //     for(int i=0;i<nums.length;i++){
        //         if((nums[i] & 1<<bit)!=0){
        //             cnt++;
        //         }
        //     }
        //     if(cnt%3==0){
        //         continue;
        //     }
        //     else{
        //         ans=ans | (1<<bit);
        //     }
        // }
        // return ans;
                        // solution - 3 more better using +3 approach
        // Arrays.sort(nums);
        // int count=0;
        // int val=0;
        // int i=1;
        // while(i<nums.length){
        //     if(nums[i]!=nums[i-1]){
        //         val=nums[i-1];
        //         count++;
        //         break;
        //     }
        //     else{
        //         i+=3;
        //     }
        // }
        // return (count==1)?val:nums[nums.length-1];



                        // solution - 4 most optimal and solved in O(n)
        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++){
            ones=(ones^nums[i]) & (~twos);
            twos=(twos^nums[i]) & (~ones);
        }
        return ones;

    }
}