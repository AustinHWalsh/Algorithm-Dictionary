package sorting;

public class MergeSort implements Sort {

    @Override
    public void sort(int arr[]) {
        // ignore 
        if (arr.length < 2) return;
        
        // get left, mid and right index
        int l = 0; int r = arr.length-1; int m = l+(r-l)/2;
        // sort left & right
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        // merge left & right
        merge(arr, l, m, r);
    }

    public void mergeSort(int arr[], int l, int r) {
        // when atomic values are reached
        if (r <= l) return;

        
        // calculate new mid index given passed left and right
        int m = l+(r-l)/2;
        // sort left & right
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        // merge left & right
        merge(arr, l, m, r);
    }

    public void merge(int arr[], int l, int m, int r) {
        // think size 2 array -> l = 0, m = 0+(1-0)/2 = 0
        int leftSize = m - l + 1;
        // m = 0, r = 1 for size 2 array
        int rightSize = r - m;

        // temp arrays for copying
        int leftArr[] = new int[leftSize];
        int rightArr[] = new int[rightSize];
        
        // copy corresponding values into arrays
        int leftIndex = 0; int rightIndex = 0;
        for (int i = l; i < m+1; i++) {
            leftArr[leftIndex] = arr[i];
            leftIndex++;
        }
        for (int i = m+1; i < r+1; i++) {
            rightArr[rightIndex] = arr[i];
            rightIndex++;
        }

        leftIndex = 0; rightIndex = 0;
        int oInd = l;
        // comparison
        while (leftIndex < leftSize && rightIndex < rightSize) {
            // if current left value is smaller, replace original array's element
            // increase index of left array to continue checking
            if (leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[oInd] = leftArr[leftIndex];
                leftIndex++;
            } else {
                arr[oInd] = rightArr[rightIndex];
                rightIndex++;
            }
            oInd++;
        }

        // fill remaining values
        while (leftIndex < leftSize) {
            arr[oInd] = leftArr[leftIndex];
            leftIndex++; oInd++;
        }
        while (rightIndex < rightSize) {
            arr[oInd] = rightArr[rightIndex];
            rightIndex++; oInd++;
        }

    }

    @Override
    public void printDetails() {
        String out = "Merge sort is a recursive divide and conquer algorithm\n"
                   + "The algorithm divides an input array into two halves and then calls its own method on those two halves\n"
                   + "Then, it takes the result from this (two sorted halves) and merges them\n"
                   + "Time Complexity: O(nlogn)\n"
                   + "Space Complexity: O(n)\n";
        System.out.println(out);
    }


    /* A utility function to print array of size n */
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*
     * Good for: speed, linked lists because of O(1) insertion, stable
     */
    
}
