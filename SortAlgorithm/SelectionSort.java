package SortAlgorithm;

public class SelectionSort {
    public static void sort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int m, int n) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 10, 2, 11};
        SelectionSort.sort(arr1);
        for(int elem : arr1) {
            System.out.print(elem);
            System.out.print(" ");
        }
        System.out.println();
    }
}