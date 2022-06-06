import sorting.*;

public class DictionaryHead {

    public static void main(String[] args) {
        Sort s = new RecursiveBubbleSort();
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        MergeSort.printArray(arr);
        s.sort(arr);
        MergeSort.printArray(arr);
        // s.printDetails();
    }

}
