package practise.datastructures.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1,3,4,5));
        spofArray(numList);

    }

    static void spofArray(ArrayList<Integer> num){

            for (int i =0; i<num.size() ; i++){
                System.out.println("");
                for(int j=0; j< num.size(); j++){
                    System.out.print(num.get(i)+""+num.get(j) +" ");
                }

            }


    }

}
