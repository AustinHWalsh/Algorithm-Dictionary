import graphs.*;
import searching.*;
import sorting.*;

public class DictionaryHead {

    public static void main(String[] args) {
        // Search s = new ExponentialSearch();
        // int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
        //     34, 55, 89, 144, 233, 377, 610};
        // System.out.println(s.search(arr, 55));
        // // s.printDetails();

        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        // g.printGraph();

        System.out.print("Traversal of graph from node: ");
        GraphSearch s = new DFS();
        s.search(g, 2);
    }

}
