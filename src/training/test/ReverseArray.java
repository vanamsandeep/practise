package training.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void main(String[] args) {
       String[] fruits = {"apples", "tomatoes", "bananas", "guavas", "pineapples","vanam"};
        int length = fruits.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = fruits[i];
            fruits[i] = fruits[length - 1 - i];
            fruits[length - 1 - i] = temp;
        }
        Arrays.asList(fruits).stream().forEach(System.out::println);

        // approach 2- using Stream API
      /*  Arrays.asList(IntStream.rangeClosed(1, fruits.length)
                .mapToObj(i -> fruits[fruits.length - i])
                .toArray()).stream().forEach(System.out::println);*/
    }
}
