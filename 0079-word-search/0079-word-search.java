class Solution {
    static int r[]={0,0,-1,1};
    static int c[]={-1,1,0,0};

    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && find(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }



    public static boolean find(int i,int j,int ind,char board[][],String word){
        //base case
        if(ind==word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(ind)){
            return false;
        }

        char temp=board[i][j];
        board[i][j]='$';
        for(int k=0;k<4;k++){
            int r_=i+r[k];
            int c_=j+c[k];
            if(find(r_,c_,ind+1,board,word)){
                return true;
            }
        }

        //using backtracking 
        board[i][j]=temp;
        return false;





    }
}