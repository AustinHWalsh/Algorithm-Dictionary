package sorting;

public class RadixSort implements Sort {

    CountingSort cSort = new CountingSort();

    @Override
    public void sort(int[] arr) {
        int max = cSort.getMax(arr);

        for (int i = 1; max / i > 0; i *= 10) 
            cSort.sortOnExp(arr, i);
    }

    @Override
    public void printDetails() {
        String out = "Radix sort is a linear way to sort an array\n"
                   + "It uses counting sort on each of the digits of elements, i.e. 1's, 10's, 100's, etc\n"
                   + "This ensures that each of the elements are sorted and in linear time but must have a modified counting sort algorithm\n"
                   + "Time Complexity: O(n)\n"
                   + "Space Complexity: O(n+k)\n";
        System.out.println(out);
    }

}
