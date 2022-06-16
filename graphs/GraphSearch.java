package graphs;

public interface GraphSearch {
    
    /**
     * Searching algorithms on graphs from a source s
     * Uses different algorithms
     * 
     * @param graph
     * @param s
     * @return index
     */
    public int search(Graph g, int s);

    /**
     * Display the details about the algorithm including
     * Time/space complexity and other important info
     */
    public void printDetails();

}
