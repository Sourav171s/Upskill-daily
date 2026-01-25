class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int n=towers.length;
        // int bind=-1;
        int bq=-1;
        int bx=-1;
        int by=-1;        
        for(int i=0;i<n;i++){
            if((Math.abs(towers[i][0]-center[0])+Math.abs(towers[i][1]-center[1]))<=radius){
                if(towers[i][2]>bq){
                    bq=towers[i][2];
                    bx=towers[i][0];
                    by=towers[i][1];
                }
                else if(towers[i][2]==bq){
                    if(towers[i][0]<bx){
                        bx=towers[i][0];
                        by=towers[i][1];
                    }
                    else if(towers[i][0]==bx){
                        if(towers[i][1]<by){
                            by=towers[i][1];
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        continue;
                    }
                }
                
            }
        }

        return new int[]{bx,by};
    }
}