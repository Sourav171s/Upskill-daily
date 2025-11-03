class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=neededTime.length;
        if(n==1){
            return 0;
        }
        int count=0;
        int i=0;
        int j=1;
        while(j<n){
            if(colors.charAt(i)!=colors.charAt(j)){
                i=j;
                j++;
            }
            else{
                if(neededTime[i]>neededTime[j]){
                    count+=neededTime[j];
                    j++;
                }
                else{
                    count+=neededTime[i];
                    i=j;
                    j++;
                }
            }
        }
        return count;
    }
}