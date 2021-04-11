package sorting.quick;

import junit.framework.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest extends TestCase {
    private QuickSort quickSort;

    @BeforeClass
    public void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    public void testQuickSort() {
        int[] arr = { 4, 6, 1, 2, 55, 81, 43, 92, 51, 13, 23, 1, 0, 90};
        quickSort.quickSort(arr);
        for (int i = 1; i < arr.length; i++) {
            assertTrue(arr[i - 1] <= arr[i]);
        }
    }

    @Test
    public void testEmptyArr() {
        int[] arr = new int[0];
        int[] comparator = arr;
        quickSort.quickSort(arr);
        assertEquals(arr, comparator);
    }

    @Test
    public void testBigEmptyArr() {
        int[] arr = new int[11];
        int[] comparator = arr;
        quickSort.quickSort(arr);
        assertEquals(arr, comparator);
    }
}
