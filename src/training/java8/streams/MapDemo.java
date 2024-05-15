package training.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDemo {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Sandeep", "vanam", "nikhila", "viya anandana", "ganji");
        List<String> updatedList = nameList.stream().map( name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println("value is "+updatedList);

        List<Integer> list1 = Arrays.asList(10, 20, 25, 30, 75, 80, 94, 22, 23);
        System.out.println("Before values are "+ list1);
        List<Integer> s = list1.stream().map(i -> i * 2 ).collect(Collectors.toList());
        System.out.println("values are "+s);

        Stream strStream = Stream.of("Welcome", "To", "java", "blog");
        List<String> finalList = (List<String>)strStream.map( name ->  {
            if(name.equals("java"))
                return "Java-practise";
            return name;
        }).collect(Collectors.toList());
        System.out.println("updated list " +finalList);
    }
}
