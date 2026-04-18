class Solution {

    public static boolean isValid(int r,int c,char ch[][]){
        //checking upwards
        for(int i=r-1;i>=0;i--){
            if(ch[i][c]=='Q'){
                return false;
            }
        }

        //checking left
        for(int i=r-1,j=c-1;i>=0 && j>=0;i--,j--){
            if(ch[i][j]=='Q'){
                return false;
            }
        }

        //checking right
        for(int i=r-1,j=c+1;i>=0 && j<ch.length;i--,j++){
            if(ch[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void helper(char ch[][],int row,int n,List<List<String>> res){
        //base case 
        if(row==n){
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(ch[i]));
            }
            res.add(l);
            return;
        }

        for(int col=0;col<n;col++){
            if(isValid(row,col,ch)){
                ch[row][col]='Q';
                helper(ch,row+1,n,res);

                //backtracking step
                ch[row][col]='.';
            }


        }


        
    }





    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char ch[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(ch[i],'.');
        }
        helper(ch,0,n,res);          //here we are sending row check,dots array and res list
        return res; 
    }
}