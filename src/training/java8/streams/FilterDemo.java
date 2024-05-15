package training.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FilterDemo {

    public static void main(String args[]) {

        List<String> list = Arrays.asList("Sandeep", "vanam", "nikhila", "viay anandana", "ganji");
       //Demo1 calling streams and filter
        Stream stream = list.stream().filter( name -> name.equals("ganji"));
        List<String> updatedList = (List<String>)stream.collect(Collectors.toList());
        //long count = stream.count();
        System.out.println("Names "+updatedList);
        //System.out.println("count is  "+count);



        List<Integer> list1 = Arrays.asList(10, 20, 25, 30, 75, 80, 94, 22, 23);
        System.out.println("Before values are "+ list1);
        List<Integer> s = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("values are "+s);




    }
}
