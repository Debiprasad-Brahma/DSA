# 🚀 BFS Traversal of a Graph in Java

This repository contains a simple Java implementation of **Breadth-First Search (BFS)** traversal for a graph using an **adjacency list representation**.

## 📌 Problem Statement

Implement a method to perform **BFS traversal** of a given graph starting from node `0`. The graph is represented using an adjacency list.

## 💡 BFS Approach

**Breadth-First Search (BFS)** is a graph traversal algorithm where we explore the neighbor nodes at the present depth prior to moving on to nodes at the next depth level.

### 🔧 Key Concepts:
- **Queue** is used to process nodes in the order they are visited.
- A **visited[]** boolean array keeps track of visited nodes to prevent cycles.
- The traversal starts from node `0`.

## 🧠 Algorithm Steps:
1. Create a boolean `visited[]` array to mark visited nodes.
2. Initialize a `Queue` and add the starting node `0`.
3. While the queue is not empty:
   - Poll the front node.
   - Add it to the answer list.
   - For all its unvisited neighbors, mark them visited and enqueue them.
4. Return the traversal list.

---

## ✅ Sample Code

```java
import java.util.*;

class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int v = adj.size();  // getting the number of vertices
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(0);              // starting from node 0
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();     // dequeue
            ans.add(node);               // process node
            
            for (int neighbours : adj.get(node)) {
                if (!visited[neighbours]) {
                    visited[neighbours] = true;  // mark visited
                    queue.add(neighbours);       // enqueue
                }
            }
        }
        return ans;
    }
}
```

---

## 📈 Time and Space Complexity

- **Time Complexity:** O(V + E)  
  `V` is the number of vertices and `E` is the number of edges.
  
- **Space Complexity:** O(V)  
  For the `visited[]` array and the queue.

---

