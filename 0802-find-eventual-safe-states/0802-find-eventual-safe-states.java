class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //here we are using outdegree instead of indegree because terminal nodes are those whose outdegree = 0 and also must reverse the graph so that connected nodes can be searched easily
        List<Integer> l=new ArrayList<>();
        List<List<Integer>> lst=new ArrayList<>();
        int n=graph.length;
        int outdeg[]=new int[n];
        for(int i=0;i<n;i++){
            lst.add(new ArrayList<>());
            outdeg[i]=graph[i].length;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                lst.get(graph[i][j]).add(i);
            }
        }

        //storing those elements in the queue whose outdeg is 0
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(outdeg[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int a = q.poll();
            l.add(a);
            for(int it:lst.get(a)){
                outdeg[it]--;
                if(outdeg[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(l);
        return l;




    }
}