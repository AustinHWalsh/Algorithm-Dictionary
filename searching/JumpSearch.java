package searching;

import java.util.Arrays;

public class JumpSearch implements Search {

    @Override
    public int search(int[] arr, int x) {
        // array must be sorted
        Arrays.sort(arr);

        // number of jumps through array
        int jumps = (int) Math.floor(Math.sqrt(arr.length));
        int l = 0; int h = jumps;
        
        // loop until index found
        while (l < arr.length) {
            // current interval contains x
            if (arr[l] <= x && arr[h] >= x) break;

            l += jumps; h += jumps;
            if (h >= arr.length) h = arr.length-1;
        }

        // found interval
        if (h < arr.length) {
            for (int i = l; i <= h; i++) 
                if (arr[i] == x) return i;
        }

        return -1;
    }

    @Override
    public void printDetails() {
        String out = "Jump search is a linear searching algorithm on a sorted array\n"
                   + "It jumps k elements through the array to find the interval that contains the requested element \n"
                   + "Then it linearly searches through the remaining area\n"
                   + "Time Complexity: O(sqrt(n))\n"
                   + "Space Complexity: O(1)\n";
        System.out.println(out);
    }
    
}
