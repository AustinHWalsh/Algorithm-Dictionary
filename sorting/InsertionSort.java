package sorting;

public class InsertionSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) return;

        for (int i = 1; i < arr.length; i++) {
            // curr less than predecessor
            if (arr[i] < arr[i-1]) {
                int j = i;
                // keep swapping until in place
                while (j > 0 && arr[j] < arr[j-1]) {
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                    j--;
                }
            }
        }
        
    }

    @Override
    public void printDetails() {
        String out = "Insertion sort is a linear sorting algorithm\n"
                   + "It moves array elements backwards until they are in place\n"
                   + "And repeats until each element is in the correct position\n"
                   + "Time Complexity: O(n^2)\n"
                   + "Space Complexity: O(1)\n";
        System.out.println(out);
    }
    
    /*
     * Good for: simplicity, efficient for small data, data that is already almost sorted
     */
}
