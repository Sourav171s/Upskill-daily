class Solution {
    //using recursion firstly 
    public static double pow(double a,int b){
        if(b==0){
            return 1;
        }
        double x=pow(a,b/2);
        if(b%2!=0){
            return  a*x*x;
        }
        return x*x;
    }





    public double myPow(double x, int n) {
        if(n<0){
            return 1.0/pow(x,-1*n);
        }
        return pow(x,n);
    }
}