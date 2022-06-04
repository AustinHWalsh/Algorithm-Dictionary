package sorting;

public class QuickSort implements Sort {

    @Override
    public void sort(int[] arr) {
        // ignore 
        if (arr.length < 2) return;

        quickSort(arr, 0, arr.length-1);
    }

    public void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            // put current element in place
            int pi = partition(arr, l, h);
            // recursively sort left and right of current element
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, h);
        }
    }

    public int partition(int[] arr, int l, int h) {
        // choose last element as pivot
        int pivot = arr[h];
        // swapping index for placing elements in right places
        int i = l-1;
        // linear fix of elements between h and low
        for (int j = l; j <= h-1; j++) {
            // curr element is smaller than pivot
            // swap with i'th element
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
            }

        }

        arr[h] = arr[i+1];
        arr[i+1] = pivot;
        return i+1;
    }

    @Override
    public void printDetails() {
        String out = "Quick sort is a recursive divide and conquer algorithm\n"
                   + "The algorithm chooses a random element in the array as a pivot\n"
                   + "and partitions the rest of the array round that pivot\n"
                   + "Time Complexity: O(nlogn)\n"
                   + "Space Complexity: O(n)\n";
        System.out.println(out);
    }
    
}
