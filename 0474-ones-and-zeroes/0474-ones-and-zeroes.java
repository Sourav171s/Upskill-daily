class Solution {

    //using memoization
    public static int function(int i,int m,int n,String arr[],int dp[][][]){
        //base case 
        if(i==arr.length){
            return 0;
        }
        if(dp[i][m][n]!=-1){
            return dp[i][m][n];
        }

        int z=0;
        int o=0;
        for(int j=0;j<arr[i].length();j++){
            if(arr[i].charAt(j)=='1'){
                o++;
            }
            else{
                z++;
            }
        }

        int ntake=function(i+1,m,n,arr,dp);

        int take=(int)(-1e5);
        if(m>=z && n>=o){
            take=1+function(i+1,m-z,n-o,arr,dp);
        }
        return dp[i][m][n]=Math.max(take,ntake);
    }


    public int findMaxForm(String[] strs, int m, int n) {
        int a=strs.length;
        int dp[][][]=new int[a][m+1][n+1];
        for(int i=0;i<a;i++){
            for(int j=0;j<=m;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return function(0,m,n,strs,dp);    
    }
}