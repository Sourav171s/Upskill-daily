/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void makingPar(TreeNode root,HashMap<TreeNode,TreeNode> hm){
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            int n=q1.size();
            for(int i=0;i<n;i++){
                TreeNode a = q1.poll();
                if(a.left!=null){
                    hm.put(a.left,a);
                    q1.add(a.left);
                }
                if(a.right!=null){
                    hm.put(a.right,a);
                    q1.add(a.right);
                }
            }
        }

    }


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        //doing using bfs
        HashMap<TreeNode,TreeNode> hm=new HashMap<>();

        //making of parent hashmap
        makingPar(root,hm);
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target); 
        Set<TreeNode> s=new HashSet<>();
        s.add(target);
        int dis=0;
        while(!q.isEmpty()){
            int n=q.size();
            if(dis==k){
                break;
            }   
            dis++;      
            for(int i=0;i<n;i++){
                TreeNode a = q.poll();
                if(a.left!=null && !s.contains(a.left)){
                    s.add(a.left);
                    q.add(a.left);
                }
                if(a.right!=null && !s.contains(a.right)){
                    s.add(a.right);
                    q.add(a.right);
                }
                if(hm.get(a)!=null && !s.contains(hm.get(a))){
                    s.add(hm.get(a));
                    q.add(hm.get(a));
                }
            }  

        }
        List<Integer> lst=new ArrayList<>();
        while(!q.isEmpty()){
            lst.add(q.poll().val);
        }
        return lst;


    }
}