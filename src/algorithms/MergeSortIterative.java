package algorithms;

public class MergeSortIterative {

    public static void main(String[] args) {
        int[] inputArray= {6,4,3,7,5,1,2};
        System.out.println("Before sorting::");
        print(inputArray);
        iterativeMergeSort(inputArray);
        System.out.println(" After sorting::");
        print(inputArray);
    }

    private static void iterativeMergeSort(int[] arr) {

        int n = arr.length;
        int[] temp = new int[n];

        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int left = 0; left < n - 1; left += 2 * currSize) {
                int mid = Math.min(left + currSize - 1, n - 1);
                int right = Math.min(left + 2 * currSize - 1, n - 1);
                merge(arr, temp, left, mid, right);
            }
        }
    }
    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }


    private static void print(int[] arr) {
        for(int num: arr){
            System.out.print(" "+num);
        }
    }


    /*
    *
    * Sure, let's break down the iterative merge sort implementation in Java step by step:

1. **mergeSort(int[] arr)**:
   - This is the main method responsible for performing the merge sort algorithm.
   - It takes an array of integers as input.
   - Inside this method, we initialize the size of the array `n` and create a temporary array `temp` of the same size as the input array to hold intermediate results.

2. **Outer Loop - Iterating Over Subarray Sizes**:
   - The outer loop controls the size of the subarrays that are being merged. It starts with `currSize = 1` and doubles the value of `currSize` in each iteration until it exceeds the length of the array.
   - For each iteration of the outer loop, `currSize` represents the size of the subarrays that will be merged in that iteration.

3. **Inner Loop - Merging Subarrays**:
   - The inner loop iterates over the array and merges adjacent subarrays of size `currSize`.
   - Inside the inner loop, we determine the boundaries of the left, mid, and right subarrays to be merged.
   - The `merge` method is called to merge the subarrays into one sorted subarray.

4. **merge(int[] arr, int[] temp, int left, int mid, int right)**:
   - This method merges two sorted subarrays into one sorted subarray.
   - It takes the input array `arr`, a temporary array `temp`, and the indices `left`, `mid`, and `right` that define the boundaries of the subarrays.
   - The method initializes three pointers `i`, `j`, and `k` to track the current positions in the left subarray, right subarray, and temporary array respectively.
   - It compares elements from the left and right subarrays and copies the smaller element to the temporary array.
   - After copying all elements, it copies the sorted elements from the temporary array back to the original array.

5. **main(String[] args)**:
   - This is the entry point of the program.
   - It initializes an array of integers, prints the original array, calls the `mergeSort` method to sort the array, and then prints the sorted array.

Overall, this iterative merge sort implementation in Java is efficient and easy to understand. It doesn't use recursion and sorts the array in place, making it suitable for large arrays without the risk of stack overflow.*/
}
