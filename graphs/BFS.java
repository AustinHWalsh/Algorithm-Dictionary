package graphs;

import java.util.*;

public class BFS implements GraphSearch {

    @Override
    public int search(Graph g, int s) {
        // create visited and queue
        int[] visited = new int[g.getVertices()];
        Queue<Integer> q = new PriorityQueue<>();

        // add start vertex to the queue
        q.add(s);
        // loop until nothing can be added to the queue
        while (q.size() != 0) {
            int curr = q.poll();

            // visited node already
            if (visited[curr] == 1) continue;

            visited[curr] = 1;
            System.out.print(curr + " ");
            List<Integer> adj = g.getEdges(curr);
            for (int i = 0; i < adj.size(); i++) 
                q.add(adj.get(i));
            
        }
        System.out.println("");
        return 0;
    }

    @Override
    public void printDetails() {
        // TODO Auto-generated method stub
        
    }
    
}
