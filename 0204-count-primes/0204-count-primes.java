class Solution {
    //checking primes but time complexity bhaag gyi
    // public static int checkprime(int x){
    //     for(int i=2;i<=Math.sqrt(x);i++){
    //         if(x%i==0){
    //             return 0;
    //         }
    //     }
    //     return 1;
    // }


    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
                        //brute force in O(n*rootn)
        // int total=0;
        // for(int i=2;i<n;i++){
        //     if(checkprime(i)==1){
        //         total+=1;
        //     }
        // }
        // return total;
                        //optimal solution in O(n + nlog(logn) + n)
        int primearr[]=new int[n+1];
        int total=0;
        Arrays.fill(primearr,1);
        for(int i=2;i*i<=n;i++){
            if(primearr[i]==1){
                // System.out.print(i + " ");
                for(int j=i*i;j<=n;j+=i){
                    primearr[j]=0;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primearr[i]==1){
                total++;
            }
        }

        return total;
    }
}