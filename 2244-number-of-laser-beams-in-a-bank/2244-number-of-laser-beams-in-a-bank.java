class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        if(n==1){
            return 0;
        }
        int count=0;
        int m=bank[0].length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<m;j++){
                    if(bank[i].charAt(j)=='1'){
                        count++;
                    }
                }
            }
            else{
                int x=0;
                for(int j=0;j<m;j++){
                    if(bank[i].charAt(j)=='1'){
                        x++;
                    }
                }
                if(x==0){
                    continue;
                }
                else{
                    ans+=x*count;
                    count=x;
                }
            }
        }
        return ans;

    }
}