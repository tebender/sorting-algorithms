package sorting.merge;

import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Test;

public class MergeSortTest extends TestCase {
    private MergeSort mergeSort;

    @BeforeClass
    public void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public void testMergeSort() {
        int[] arr = { 4, 6, 1, 2, 55, 81, 43, 92, 51, 13, 23, 1, 0, 90};
        mergeSort.mergeSort(arr);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    @Test
    public void testEmptyArr() {
        int[] arr = new int[0];
        int[] comparator = arr;
        mergeSort.mergeSort(arr);
        assertEquals(arr, comparator);
    }

    @Test
    public void testBigEmptyArr() {
        int[] arr = new int[11];
        int[] comparator = arr;
        mergeSort.mergeSort(arr);
        assertEquals(arr, comparator);
    }
}
