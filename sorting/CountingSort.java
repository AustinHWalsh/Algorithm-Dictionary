package sorting;

public class CountingSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) return;

        // create array to store counts of each num
        // assuming 0 <= max(arr) <= 256
        int[] countArr = new int[256];

        // count each element present in original array
        for (int i = 0; i < arr.length; i++) 
            countArr[arr[i]] += 1;
        
        // sum up each position in the count array
        for (int i = 1; i < countArr.length; i++) 
            countArr[i] += countArr[i-1];
        
        int[] output = new int[arr.length];
        // loop through original array again and find position of each element in output
        // array by looking it up in the count array
        for (int i = 0; i < arr.length; i++) {
            output[countArr[arr[i]]-1] = arr[i];
            countArr[arr[i]]--;
        }

        // copy back to original array
        for (int i = 0; i < output.length; i++) 
            arr[i] = output[i];
        
    }

    public void sortOnExp(int[] arr, int exp) {
        // create array to store counts of each num
        // assuming 0 <= max(arr) <= 9
        int[] countArr = new int[10];

        // count each element present in original array
        for (int i = 0; i < arr.length; i++) {
            countArr[(arr[i]/exp)%10] += 1;
        }
        
        // sum up each position in the count array
        for (int i = 1; i < countArr.length; i++) 
            countArr[i] += countArr[i-1];
        
        int[] output = new int[arr.length];
        // loop through original array again and find position of each element in output
        // array by looking it up in the count array
        for (int i = arr.length-1; i >= 0; i--) {
            output[countArr[(arr[i]/exp)%10]-1] = arr[i];
            countArr[(arr[i]/exp)%10]--;
        }

        // copy back to original array
        for (int i = 0; i < output.length; i++) 
            arr[i] = output[i];
    }

    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
            if (max < arr[i]) max = arr[i];
        
        return max;
    }

    @Override
    public void printDetails() {
        String out = "Counting sort is a linear way to sort an array\n"
                   + "It calculates counts of elements in array and stores them in a separate array\n"
                   + "Then it builds a sorted array by looking up indexes of elements in the separate array\n"
                   + "Time Complexity: O(n+k) where k is range of input\n"
                   + "Space Complexity: O(n+k)\n";
        System.out.println(out);
    }
    
}
