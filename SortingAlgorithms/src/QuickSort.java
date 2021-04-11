public class QuickSort {

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr,pivot + 1, high);
        }
    }

    public int partition(int[] arr, int low, int high) {
        int p = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= p) {
                //swap i, j
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap i, pivot
        i++;
        int temp = arr[i];
        arr[i] = p;
        arr[high] = temp;
        return i;
    }
}
