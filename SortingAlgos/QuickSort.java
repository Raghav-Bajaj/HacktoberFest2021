package SortingAlgos;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr, int low, int high){

        int pivot = arr[high];

        int i = low - 1;

        for(int j=low;j<=high;j++){

            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static void quick(int[] arr, int low, int high){

        if(low < high){

            int part = partition(arr, low, high);

            quick(arr, low, part - 1);
            quick(arr, part + 1, high);

        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        long start = System.nanoTime();

        quick(arr,0, arr.length-1);

        long end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4};

        start = System.nanoTime();

        quick(arr,0, arr.length-1);

        end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));
    }


}
