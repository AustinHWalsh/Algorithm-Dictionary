package sorting;

public class BubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) return;

        // test for sortedness 
        boolean noSwaps = false;
        while (!noSwaps) {
            noSwaps = true;
            // loop through and swap each out of order
            for (int i = 0; i < arr.length-1; i++) {
                int j = i+1;
                // found out of place element
                // swap and make loop run again
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    noSwaps = false;
                }
            }
            
        }
    }

    @Override
    public void printDetails() {
        String out = "Bubble sort is a linear sorting algorithm\n"
                   + "It loops through an array and check if any two values next to each other are out of order\n"
                   + "It swaps them if they are and keeps swapping them until the array is sorted\n"
                   + "Time Complexity: O(n^2)\n"
                   + "Space Complexity: O(1)\n";
        System.out.println(out);
    }
    
    /*
     * Good for: simplicity, in-place, stable
     */

}
