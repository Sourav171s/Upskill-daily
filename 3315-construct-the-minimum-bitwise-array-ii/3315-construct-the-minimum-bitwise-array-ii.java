class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int a=nums.get(i);
            if(a%2==0){
                arr[i]=-1;
            }
            else {
                arr[i]=a-((a+1)&(-a-1))/2;
            }

            //here we have to find firstly the position of rightmost 0 bit then make the next 1 bit to 0 and return the answer 
            //eg. for 7 = 0111     the ans is 0011
            // for 3 = 011    the ans is 001 ,   for 5 = 101  the answer is 100
            //here (a+1)&(-a-1) gives the first 0 bit and then divide by 2 right shift the 1 and then subtracting it from the a remove that 1 bit and give us the required result
             

        }
        return arr;


    }
}