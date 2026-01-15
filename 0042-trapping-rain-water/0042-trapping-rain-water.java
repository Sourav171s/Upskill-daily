class Solution {
    public int trap(int[] height) {

                                    //brute force solution where time complexity is O(2n) and space complexity is O(2*n)
        // int n=height.length;
        // int left[]=new int[n];
        // left[0]=height[0];
        // for(int i=1;i<n;i++){
        //    left[i]=Math.max(left[i-1],height[i]);
        // }

        // int total=0;
        // int mx=height[n-1];
        // for(int i=n-2;i>=0;i--){
        //    mx=Math.max(height[i],mx);
        //    total+=Math.min(mx,left[i])-height[i];
        // //    a=Math.max(a,height[i]);
        // }
        // return total;

                            //Optimal solution where space complexity is O(1) and time compexity is O(n)
                                    //using two pointer approach here
        int lmax=0;
        int rmax=0;
        int total=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    total+=lmax-height[l];
                }
                else{
                    lmax=height[l];
                }
                l++;
            }
            else{
                if(rmax>height[r]){
                    total+=rmax-height[r];
                }
                else{
                    rmax=height[r];
                }
                r--;
            }
        }
        return total;




    }
}