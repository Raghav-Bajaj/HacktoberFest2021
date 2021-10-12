package SortingAlgos;

import java.util.Arrays;

public class InsertionSort {

    static void insertion(int[] arr){

        for(int i=1;i<arr.length;i++){
            int temp = arr[i];

            int j = i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;

        }

    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        long start = System.nanoTime();

        insertion(arr);

        long end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4};

        start = System.nanoTime();

        insertion(arr);

        end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));
    }


}
