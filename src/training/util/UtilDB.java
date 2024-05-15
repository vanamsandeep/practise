package training.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtilDB {

    public static List<Employee> getAllEmployee() {
        return Stream.of(
                new Employee(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725")),
                new Employee(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947")),
                new Employee(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236")),
                new Employee(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"))
        ).collect(Collectors.toList());
    }

    public static List<Data> getAllData() {
        return Stream.of(
                new Data(101, "john", "john@gmail.com", 397937955),
                new Data(102, "smith", "smith@gmail.com", 89563865),
                new Data(103, "peter", "peter@gmail.com", 389463286),
                new Data(104, "kely", "kely@gmail.com", 389246829),
                new Data(104, "kely", "kely@gmail.com", 389246829)
        ).collect(Collectors.toList());
    }
}
