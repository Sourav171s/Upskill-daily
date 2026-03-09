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
                                      //method 1 and in this time complexity is O(n2)
    // public static TreeNode insert(TreeNode root, int a){
    //     if(root==null){
    //         root=new TreeNode(a);
    //         return root;
    //     }
    //     if(root.val<a){
    //         root.right=insert(root.right,a);
    //     }
    //     else if(root.val>a){
    //         root.left=insert(root.left,a);
    //     }
    //     return root;
    // }




    //public TreeNode bstFromPreorder(int[] preorder) {
        // if(preorder.length==0){
        //     return null;
        // }
        // TreeNode root=new TreeNode(preorder[0]);
        // for(int i=1;i<preorder.length;i++){
        //     root=insert(root,preorder[i]);
        // }
        // return root;

        
    // } 
                                            //mehtod 2 and in this time complexity is O(n)

    public TreeNode bstFromPreorder(int[] preorder) {
        return bsthelper(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    public static TreeNode bsthelper(int A[],int upperbound,int i[]){
        if(i[0]==A.length || A[i[0]]>upperbound){
            return null;

        }
        TreeNode root=new TreeNode(A[i[0]++]);
        root.left=bsthelper(A,root.val,i);
        root.right=bsthelper(A,upperbound,i);
        return root;
    } 
}