package searching;

public class BinarySearch implements Search {

    @Override
    public int search(int[] arr, int x) {
        return recursiveSearch(arr, 0, arr.length-1, x);
    }

    public int recursiveSearch(int[] arr, int l, int h, int x) {
        // base case: x not found
        if (h < l) return -1;

        int m = l + (h - l)/2;
        // check m
        if (arr[m] == x) return m;
        // middle larger - check bottom half
        else if (arr[m] > x) 
            return recursiveSearch(arr, l, m-1, x);
        // middle smaller - check top half
        else
            return recursiveSearch(arr, m+1, h, x);
    }

    @Override
    public void printDetails() {
        String out = "Binary search is a recursive searching algorithm\n"
                   + "It checks the middle element of an array and determines if the specified element is higher, lower or the same\n"
                   + "It then either looks through the higher/lower section or returns it if it is equal\n"
                   + "Time Complexity: O(nlogn)\n"
                   + "Space Complexity: O(1)\n";
        System.out.println(out);
    }

}
