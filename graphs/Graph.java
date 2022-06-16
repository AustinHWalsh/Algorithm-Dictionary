package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    
    private List<List<Integer>> graph = new ArrayList<>();
    private int v;

    public Graph(int v) {
        this.v = v;
        // setup lists in lists
        for (int i = 0; i < v; i++) 
            graph.add(new ArrayList<Integer>()); 
        
    }

    // add an edge between node s and node d
    public void addEdge(int s, int d) {
        graph.get(s).add(d);
        graph.get(d).add(s);
    }

    public void printGraph() {
        for (int i = 0; i < v; i++) {
            System.out.print("List of node " + i + ": head");
            List<Integer> iList = graph.get(i);
            for (int j = 0; j < iList.size(); j++) 
                System.out.print(" -> " + iList.get(j));
            System.out.println("");
        }
    }

    public List<Integer> getEdges(int v) {
        return graph.get(v);
    }

    public List<List<Integer>> getGraph() {
        return graph;
    }

    public int getVertices() {
        return v;
    }
}
