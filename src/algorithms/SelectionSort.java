package algorithms;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arrayNum = {3,5,1,7,8,3,10};
        System.out.println("Before sort ");
        print(arrayNum);
        selectionSort(arrayNum);
        for(int num: arrayNum){
            System.out.print(" "+num);
        }
    }

    public static void selectionSort(int[] array){

        int length = array.length;
        for(int i=0; i<length ; i++){
            int min_element = i;
            for(int j= i+1; j<length ; j++){
                if(array[j] < array[min_element]){
                    min_element = j;
                }
            }
            int temp = array[i];
            array[i] =array[min_element];
            array[min_element] = temp;
        }
    }

    public static void print(int[] arr) {
        for(int num: arr){
            System.out.print(" "+num);
        }
    }
}
