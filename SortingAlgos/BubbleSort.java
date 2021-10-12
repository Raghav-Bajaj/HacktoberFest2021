package SortingAlgos;

import java.util.Arrays;

public class BubbleSort {

    static void bubble(int[] arr){
        boolean flag;

        for(int i=1;i<arr.length;i++){
            flag = false;
            for(int j=0;j<arr.length - i; j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4, 3, 2, 1};

        long start = System.nanoTime();

        bubble(arr);

        long end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4};

        start = System.nanoTime();

        bubble(arr);

        end = System.nanoTime();

        System.err.println(end - start);

        System.out.println(Arrays.toString(arr));

    }


}
