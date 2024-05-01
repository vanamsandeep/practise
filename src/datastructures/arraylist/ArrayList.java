package datastructures.arraylist;

import java.util.Arrays;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> numList = new java.util.ArrayList<>(Arrays.asList(1,3,4,5));
        spofArray(numList);

    }

    static void spofArray(java.util.ArrayList<Integer> num){

            for (int i =0; i<num.size() ; i++){
                System.out.println("");
                for(int j=i+1; j< num.size(); j++){
                    System.out.print(num.get(i)+""+num.get(j) +" ");
                }

            }


    }

}
