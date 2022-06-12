package searching;

public interface Search {
    
    /**
     * Find the position of element x in an array
     * Uses different algorithms
     * 
     * @param arr
     * @param x
     * @return index
     */
    public int search(int arr[], int x);

    /**
     * Display the details about the algorithm including
     * Time/space complexity and other important info
     */
    public void printDetails();
}
