package algorithms.sorting;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length-1);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    private static void quicksort(int[] numbers, int lowIndex, int highIndex) {

        if(lowIndex >+ highIndex){
            return;
        }

        //Step1: Select the pivot-select the highest index in the array
        int pivot = numbers[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //Step 2 - Do the partition
        while(leftPointer < rightPointer){
            while(numbers[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(numbers[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            //Step 3 - Swap the elements if not satisfied the condition
            swap(numbers, leftPointer, rightPointer);
        }
            //Step 4- when left pointer and right pointer meets at a location we need to swap the left pointer with highIndex as we selected pivot as high index
        swap(numbers, leftPointer, highIndex);

        //Step:5 recursively call left and right sub arrays to the pivot the get the complete sort
        quicksort(numbers, lowIndex, leftPointer-1); // since leftpointer is pointing highest of left array
        quicksort(numbers, leftPointer +1, highIndex);
    }

    private static void swap(int[] numbers, int index1, int index2) {

        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print ("  "+numbers[i]);
        }

    }
}
