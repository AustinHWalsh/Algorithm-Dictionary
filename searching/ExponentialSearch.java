package searching;

import java.util.Arrays;

public class ExponentialSearch implements Search {

    @Override
    public int search(int[] arr, int x) {
        // on sorted array
        Arrays.sort(arr);

        int i;
        // increase sub array by 2 each time
        for (i = 1; i < arr.length; i*=2) {
            // x must be before i
            if (arr[i] > x) break;
        }

        BinarySearch s = new BinarySearch();
        // preform binary search between i/2 and i
        return s.recursiveSearch(arr, i/2, Math.min(i, arr.length-1), x);
    }

    @Override
    public void printDetails() {
        String out = "Exponential search is a mix of jump search and binary search\n"
                   + "It creates a sub array and looks at the last element to see if its larger than x\n"
                   + "Then if it is, it preforms binary search between i/2 and i\n"
                   + "Time Complexity: O(logn)\n"
                   + "Space Complexity: O(1)\n";
        System.out.println(out);
    }

}
