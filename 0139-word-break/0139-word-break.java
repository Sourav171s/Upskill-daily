class Solution {

   //using memoization now 
   public static boolean func(int ind,String s,Set<String> st,int n,Boolean dp[]){
        //base case
        if(ind==n){
            return true;
        }
        if(dp[ind]!=null){
            return dp[ind];
        }


        for(int i=ind;i<n;i++){
            // System.out.println(x+" 1");
            if(st.contains(s.substring(ind,i+1))){
                // System.out.println(x+" 2");
                if(func(i+1,s,st,n,dp)){
                    return dp[ind]=true;
                }
            }
        }
        return dp[ind]=false;


   }




    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> st=new HashSet<>(wordDict);
        int n=s.length();
        Boolean dp[]=new Boolean[n];
        return func(0,s,st,n,dp);
    }
}