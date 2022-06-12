import searching.BinarySearch;
import searching.Search;
import sorting.*;

public class DictionaryHead {

    public static void main(String[] args) {
        Search s = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        System.out.println(s.search(arr, 10));
        // s.printDetails();
    }

}
