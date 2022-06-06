package sorting;

public class RecursiveBubbleSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) return;

        bubbleSort(arr, arr.length-1);
    }

    public void bubbleSort(int[] arr, int h) {
        // base case
        if (h == 0) return;

        for (int i = 0; i < h; i++) {
            int j = i+1;
            // out of order adjecent elements - swap
            if (arr[i] > arr[j]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        // recurse again but exclude last put element
        bubbleSort(arr, h-1);
    }

    @Override
    public void printDetails() {
        String out = "Bubble sort but implemented recursively\n"
                + "As bubble sort moves the largest element to the back each loop\n"
                + "Keep recursing until the size of the area to be check is 1\n"
                + "Time Complexity: O(n^2)\n"
                + "Space Complexity: O(1)\n";
        System.out.println(out);
    }
    
}
