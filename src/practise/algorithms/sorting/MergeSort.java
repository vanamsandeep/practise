package practise.algorithms.sorting;

public class MergeSort {
    public static void main(String[] args) {

        int[] inputArray= {6,4,3,7,5,1,2};
        System.out.println("Before sorting::");
        print(inputArray);
        mergeSort(inputArray);
        System.out.println(" After sorting::");
        print(inputArray);
    }

    private static void mergeSort(int[] inputArray) {
        //Merge sort works on divide and conquer
        if(inputArray.length <2)
            return;

        int length = inputArray.length;
        //Step 1: find the mid index
        int midIndex = length/2;
        int[] leftHalfArray = new int[midIndex];
        int[] rightHalfArray = new int[length-midIndex];

        //Now copy the input array into 2 arrays.
        for(int i=0; i< midIndex ; i++){
            leftHalfArray[i] = inputArray[i];
        }
        for(int i= midIndex; i< length ; i++){
            rightHalfArray[i - midIndex] = inputArray[i];
        }
        mergeSort(leftHalfArray);
        mergeSort(rightHalfArray);


        merging(leftHalfArray, rightHalfArray, inputArray);
    }

    private static void merging(int[] leftHalfArray, int[] rightHalfArray, int[] inputArray) {
        int leftHalfLength = leftHalfArray.length;
        int rightHalfLength = rightHalfArray.length;

        int i=0, j=0, k=0;

        while(i <leftHalfLength && j< rightHalfLength){
            if(leftHalfArray[i] <= rightHalfArray[j]){
                inputArray[k] = leftHalfArray[i];
                i++;
            }else {
                inputArray[k] = rightHalfArray[j];
                j++;
            }
            k++;
        }

        while(i < leftHalfLength){
            inputArray[k]= leftHalfArray[i];
            i++;
            k++;
        }

        while(j < rightHalfLength){
            inputArray[k]= rightHalfArray[j];
            j++;
            k++;
        }

    }

    private static void print(int[] arr) {
        for(int num: arr){
            System.out.print(" "+num);
        }

    }
}
