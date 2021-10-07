package SortingAlgos;

import java.util.Arrays;

public class HeapSort {

    static void heapify(int[] arr, int i, int n){

        int largest = i;

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if(l<n && arr[l] > arr[largest]){
            largest = l;
        }

        if(r < n && arr[r] > arr[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,largest,n);
        }

    }

    public static void heapSort(int[] arr){

        int n = arr.length;

        for(int j=n/2 - 1;j>=0;j--){
            heapify(arr,j,n);
        }

        for(int i = n-1;i>0;i--){

            int temp = arr[0];
            arr[0]= arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }

    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4, 3, 2, 1};

        long start = System.nanoTime();

        heapSort(arr);

        long end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4};

        start = System.nanoTime();

        heapSort(arr);

        end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));
    }


}
