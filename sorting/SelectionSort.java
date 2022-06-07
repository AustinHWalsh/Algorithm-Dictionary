package sorting;

public class SelectionSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) return;

        // loop through entire array
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i]; int minInd = i;
            // find min element in remaining unsorted section
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minInd = j;
                }
            }

            // swap head of unsorted with min
            int tmp = arr[i];
            arr[i] = min;
            arr[minInd] = tmp;
        }

    }

    @Override
    public void printDetails() {
        String out = "Selection sort is a linear sort algorithm\n"
            + "It finds the smallest element in the remaining unsorted array and moves it to the front\n"
            + "of the unsorted section. Then it repeats until the unsorted section is 1\n"
            + "Time Complexity: O(n^2)\n"
            + "Space Complexity: O(1)\n";
        System.out.println(out);
    }

    /*
     * Good for: in-place, simplicity
     */
}
