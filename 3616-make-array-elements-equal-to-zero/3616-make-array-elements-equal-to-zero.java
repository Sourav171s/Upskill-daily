class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        if(n==1 && nums[0]==0){
            return 2;
        }
        int arr[]=new int[n];
        arr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i+1]+nums[i];
        }
        int sum=nums[0];
        int count=0;
        if(nums[0]==0){
            if(arr[1]==1){
                count++;
            }
            else if(arr[1]==0){
                count+=2;
            }
        }
        for(int i=1;i<n-1;i++){
            if(nums[i]==0){
                if(sum==arr[i+1]){
                    count+=2;
                }
                else if(Math.abs(sum-arr[i+1])==1){
                    count++;
                }
            }
            sum+=nums[i];
        }
        if(nums[n-1]==0){
            if(sum==1){
                count++;
            }
            else if(sum==0){
                count+=2;
            }
        }
        return count;




    }
}