class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m=potions.length;
        for(int i=0;i<spells.length;i++){
            long a=spells[i];
            int j=0;
            int k=m-1;
            int ans=-1;
            while(j<=k){
              int mid=j+(k-j)/2;
              if(potions[mid]*a>=success){
                ans=mid;
                k=mid-1;
              }
              else{
                j=mid+1;
              }
            }
            if(ans==-1){
                spells[i]=0;
                }
            else{
                spells[i]=m-ans;
                }
        }
        return spells;
    }
}