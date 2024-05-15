package training.java8.streams;

import training.util.UtilDB;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 25, 30, 20, 80, 10, 22, 30);
        System.out.println("Before using distinct method" +list1);
        List<Integer> distinctList = list1.stream().distinct().toList();
        System.out.println("Updated list after distinct "+distinctList);

        System.out.println("Before employee distinct list "+ UtilDB.getAllData());

    }
}
