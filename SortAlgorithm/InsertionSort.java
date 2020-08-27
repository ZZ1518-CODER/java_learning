package SortAlgorithm;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i = 1; i < arr.length; i++) {
            int elem = arr[i];
            for(int j = i - 1; j >= 0 && arr[j] > elem; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    public static void swap(int[] arr, int m, int n) {
        int tmp = arr[m];
        arr[m] = arr[n];
        arr[n] = tmp;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 10, 2, 11};
        InsertionSort.sort(arr1);
        for(int elem : arr1) {
            System.out.print(elem);
            System.out.print(" ");
        }
        System.out.println();
    }
}