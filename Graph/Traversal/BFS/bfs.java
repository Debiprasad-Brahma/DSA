// GFG Solution

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();  // getting the size
        ArrayList<Integer> ans = new ArrayList<>();
        boolean [] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            ans.add(node);
            
            for(int neighbours : adj.get(node)){
                if(!visited[neighbours]){
                    visited[neighbours] = true;
                    queue.add(neighbours);
                }
            }
        }
        return ans;
    }
}
