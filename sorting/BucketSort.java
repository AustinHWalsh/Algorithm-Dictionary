package sorting;

import java.util.*;

public class BucketSort implements Sort {

    @Override
    public void sort(int[] arr) {
        // 
    }

    public void floatSort(float[] arr) {
        if (arr.length < 2) return;
        int n = arr.length;

        List<List<Float>> buckets = new ArrayList<>();
        // construct 2d array for buckets
        for (int i = 0; i < n; i++)
            buckets.add(new ArrayList<Float>());
        
        // add each element to its corresponding bucket
        for (int i = 0; i < n; i++) {
            int idx = (int) ((int) n * arr[i]);
            buckets.get(idx).add(arr[i]);
        }

        // sort each bucket
        for (int i = 0; i < n; i++)
            Collections.sort(buckets.get(i));
        
        // Concatenate buckets back into original array
        int idx = 0;
        for (int i = 0; i < n; i++) {
            List<Float> currBucket = buckets.get(i);
            for (int j = 0; j < currBucket.size(); j++) 
                arr[idx++] = currBucket.get(j);
        }
    }

    /* A utility function to print array of size n */
    public static void printArray(float arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    @Override
    public void printDetails() {
        String out = "Bucket sort is a linear sorting algorithm\n"
                   + "It assigns each float in an array to a bucket based on an equation (n * element)\n"
                   + "Then it sorts each bucket using insertion sort and reconstructs the array\n"
                   + "by placing each sorted bucket in the array in ascending order"
                   + "Time Complexity: O(n)\n"
                   + "Space Complexity: O(n+k) where k is the number of buckets\n";
        System.out.println(out);
    }
    
}
