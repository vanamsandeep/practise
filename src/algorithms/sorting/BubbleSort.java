package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr ={ 4,1,3,7,9};
        bubbleSort(arr);
        print(arr);


    }

    private static void print(int[] arr) {
       for(int num: arr){
           System.out.println("After "+num);
       }

    }

    private static void bubbleSort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
