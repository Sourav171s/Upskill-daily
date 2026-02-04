class Solution {

    public static int binser(int mp[][],int target){
        int fint=-1;
        boolean a =false; 
        int si=0;
        int ei=mp.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(mp[mid][0]==target){
                return mp[mid][1];
            }
            else if(mp[mid][0]>target){
                fint=mp[mid][1];
                ei=mid-1;
                a=true;
            }
            else{
                si=mid+1;
            }
        }
        return (a==true) ? fint : -1;
        
    }

    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int mp[][]=new int[n][2];
        for(int i=0;i<n;i++){
            mp[i][0]=intervals[i][0];
            mp[i][1]=i;
        }
        Arrays.sort(mp,(a,b) -> {
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            else{
                return a[1]-b[1];
            }
        });
        int i=0;
        int arr[]=new int[n];
        while(i<n){
            int a = binser(mp,intervals[i][1]);
            arr[i]= a;
            i++;
        }
        return arr;

    }
}