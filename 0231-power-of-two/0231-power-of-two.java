class Solution {
    public boolean isPowerOfTwo(int n) {
        //brute force solution
        // if(n<0){
        //     return false;
        // } 
        // String str=Integer.toBinaryString(n);            //in logn
        // int a=0; 
        // for(int i=0;i<str.length();i++){
        //     if(a>1){
        //         return false;
        //     }
        //     else{
        //     if(str.charAt(i)=='1'){
        //         a++;
        //     }
        //     else{
        //         continue;
        //     }
        //     }
        // }
        // return (a>1 || a==0)?false:true;  

                //optimal solution having no loop and no recursion
                return (n>0 && ((n&(n-1))==0));

    }
}