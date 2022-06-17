package graphs;

import java.util.List;

public class DFS implements GraphSearch {

    @Override
    public int search(Graph g, int s) {
        System.out.print("Path from " + s + ": ");        

        dfs(g, new int[g.getVertices()], s);
        System.out.println("");
        return 0;
    }

    public void dfs(Graph g, int[] visited, int curr) {
        // mark current node visited and print
        visited[curr] = 1;
        System.out.print(curr + " ");

        List<Integer> n = g.getEdges(curr);
        for (int i = 0; i < n.size(); i++) {
            // not visited neighbour
            if (visited[n.get(i)] != 1) dfs(g, visited, n.get(i));
        } 
    }

    @Override
    public void printDetails() {
        String out = "Depth-first search is a graph traversal algorithm\n"
                + "It moves through a graph by finding a single edge connected to the current node\n"
                + "It then traverses that until it reaches the last, then it backtracks and continues\n"
                + "Time Complexity: O(v + e)\n"
                + "Space Complexity: O(v)\n";
        System.out.println(out);
    }
    
}
