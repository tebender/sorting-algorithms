package sorting.merge;

import sorting.quick.QuickSort;

public class Driver {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        int[] arr = new int[args.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(args[i]);
        }

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1] + "]");
    }
}
