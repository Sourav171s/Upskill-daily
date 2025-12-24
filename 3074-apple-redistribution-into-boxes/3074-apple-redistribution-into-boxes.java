class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int m=capacity.length;
        Arrays.sort(capacity);
        int inp=0;
        for(int i=0;i<apple.length;i++){
            inp+=apple[i];
        }
        int i=m-1;
        while(i>=0 && inp>0){
            inp-=capacity[i];
            i--;
        }
        return m-i-1;
    }
}