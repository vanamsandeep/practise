package practise.test;

public class ArrayTest {

    public static void main(String[] args) {
        int[] myArray = new int [] {1, 2, 3, 4,5,69};
        int[] newArray2 = middle(myArray);
        System.out.println("length is "+ newArray2.length);
        for (int i : newArray2){
            System.out.println(i);
        }
    }

    public static int[] middle(int[] array) {

        if (array.length > 2) {
            int length = array.length;
            int[] newArray = new int[length - 2];
            int index = 1;
            while (index < length - 1) {
                newArray[index-1] = array[index];
                index++;
            }
            return newArray;
        }
        return array;
    }

}
