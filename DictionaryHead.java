import searching.BinarySearch;
import searching.ExponentialSearch;
import searching.JumpSearch;
import searching.Search;
import sorting.*;

public class DictionaryHead {

    public static void main(String[] args) {
        Search s = new ExponentialSearch();
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
            34, 55, 89, 144, 233, 377, 610};
        System.out.println(s.search(arr, 55));
        // s.printDetails();
    }

}
