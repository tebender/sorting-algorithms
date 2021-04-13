package sorting.merge;

public class MergeSort {

    public void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public void merge(int[] arr, int l, int m, int r) {
        int sizeLeft = m - l + 1;
        int sizeRight = r - m;

        // create temp arrays
        int[] left = new int[sizeLeft];
        int[] right = new int[sizeRight];

        // copy into temp arrays
        for (int i = 0; i < sizeLeft; i++) {
            left[i] = arr[i + l];
        }
        for (int i = 0; i < sizeRight; i++) {
            right[i] = arr[i + m + 1];
        }

        // merge arrays
        int i = 0;
        int j = 0;
        int k = l;
        while(i < sizeLeft && j < sizeRight) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // may be remaining elements in one of the arrays, copy them in
        while (i < sizeLeft) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < sizeRight) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
