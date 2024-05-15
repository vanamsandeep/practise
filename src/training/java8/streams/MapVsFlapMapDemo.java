package training.java8.streams;

import training.util.UtilDB;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlapMapDemo {

    public static void main(String[] args) {

        System.out.println("print employee details");

        UtilDB.getAllEmployee().stream().forEach(employee -> System.out.println(employee.name));

        //Map Demo. it will take employee list and print new list
        List<String> employeeEmailList = UtilDB.getAllEmployee().stream().map(employee -> employee.email).collect(Collectors.toList());

        System.out.println(employeeEmailList); //---> here it has only one email is printed for each employee

        //Now if I want to get the employee phone numbers using map it will print list of list values because it has multiple phone numbers for each employee

        List<List<Integer>> phoneNumbersList = UtilDB.getAllEmployee().stream().map(employee -> employee.phoneNumbers).collect(Collectors.toList());
        System.out.println("Before FlatMap ::"+phoneNumbersList);

        //But if we use flat map it will flattern the list of list into single list and also do the data transformation

        List<Integer> flatternList = UtilDB.getAllEmployee().stream().flatMap(employee -> employee.phoneNumbers.stream()).collect(Collectors.toList());

        System.out.println("After flatMap ::"+flatternList);

    }
}
