/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int greatree(int a,int b,int c,int arr[]){
        // arr[1]=a;
        arr[1]=b;
        arr[2]=c;
        arr[3]=a+b+c;
        arr[4]=b+a;
        arr[5]=c+a;
        int mx=a;
        for(int i=1;i<6;i++){
            mx=Math.max(mx,arr[i]);
        }
        return mx;
    }



    public static int dfs(TreeNode root,int arr[]){
        //base case 
        if(root==null){
            return 0;
        }
        int ls=dfs(root.left,arr);
        int rs=dfs(root.right,arr);

        // int tsum=ls+rs+root.val;
        // int ex=greatree(root.val,ls,rs,arr);
        int lmx=Math.max(ls,0);
        int rmx=Math.max(rs,0);
        int ex=root.val+lmx+rmx;
        if(ex>arr[0]){
            arr[0]=ex;
        }
        return root.val+Math.max(lmx,rmx);



    }




    public int maxPathSum(TreeNode root) {
        int arr[]=new int[6];
        arr[0]=Integer.MIN_VALUE;
        int a=dfs(root,arr);
        if(root.val>arr[0]){
            return root.val;
        }
        return arr[0];
    }
}