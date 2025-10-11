class Solution {

    public static void function(int r,char box[][],List<List<String>> lst,int n){
        //base case
        if(r==n){
            lst.add(construct(box));
            return ;
        }


        for(int col=0;col<n;col++){
            if(issafe(r,col,box,n)){
                box[r][col]='Q';
                function(r+1,box,lst,n);

                //backtrack
                box[r][col]='.';
            }
        }

    }


    public static boolean issafe(int r,int c,char box[][],int n){
        //col check
        for(int i=0;i<r;i++){
            if(box[i][c]=='Q'){
                return false;
            }
        }

        //left digonal check
        for(int i=r-1,j=c-1; i>=0 && j>=0 ;i--,j--){
            if(box[i][j]=='Q'){
                return false;
            }
        }

        //right digonal
        for(int i=r-1,j=c+1; i>=0 && j<n ;i--,j++){
            if(box[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

   public static List<String> construct(char box[][]){
        List<String> l=new ArrayList<>();
        for(char x[]:box){
            // l.add(x.toString());                    if we do this then Java sirf hashcode return karega, not the actual string. 
            l.add(new String(x));  
         }
        return l;
   }


    public List<List<String>> solveNQueens(int n) {
        char box[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(box[i],'.');
        }
        List<List<String>> lst=new ArrayList<>(); 
        function(0,box,lst,n); 
        return lst;
    }
}