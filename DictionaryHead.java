import sorting.*;

public class DictionaryHead {

    public static void main(String[] args) {
        BucketSort s = new BucketSort();
        // int arr[] = {38, 27, 43, 3, 9, 82, 10};
        float arr[] = {(float)0.78, (float)0.17, (float)0.39, (float)0.26, (float)0.72, (float)0.94, (float)0.21, (float)0.12, (float)0.23, (float)0.68};
        BucketSort.printArray(arr);
        s.floatSort(arr);
        BucketSort.printArray(arr);
        // s.printDetails();
    }

}
