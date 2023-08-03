package baymax.project.practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowToCreatAList {
    public static void main(String[] args) {
        //ArrayList---> generic
        ArrayList<Identification> studentList = new ArrayList<>();
        studentList.add(new Identification("Sung", "Le"));
        studentList.add(new Identification("Son", "Nguyen"));
        studentList.add(new Identification("Duong", "Tran"));
        studentList.forEach(student -> System.out.println(student.getFirstName()));
        System.out.println("Truoc: " + studentList.size());
        studentList.ensureCapacity(4);
        studentList.forEach(student -> System.out.println(student.getFirstName()));
        System.out.println("Sau: " + studentList.size());
        //System.out.println(studentList.ensureCapacity(1).toString);

        //Arrays.asList()
        List fields = Arrays.asList("IT", "Service", "Logistic", "Food & Beverage", "Name01");
        System.out.println(fields);

        //List.of() - java 9+
        List dataTypeList = List.of("String", "Number", "Integer", "Double");
        System.out.println(dataTypeList);

        //List.copyOf() - Java 10
        List newList = List.copyOf(fields);
        System.out.println(newList);

        //List.subList()
        List originalList = fields;
        System.out.println(originalList.subList(1,2)); //Service
        System.out.println(originalList.subList(1,3)); //Service, Logistic
        System.out.println(originalList.subList(1,4)); //"Service", "Logistic", "Food & Beverage"
        System.out.println(originalList.subList(2,2)); //empty
        System.out.println(originalList.subList(2,3)); //
        System.out.println(originalList.subList(2,4));
        System.out.println(originalList.subList(0,2)); //"IT", "Service"
        System.out.println(originalList.subList(0,3)); //"IT", "Service", "Logistic"
        System.out.println(originalList.subList(0,4));

        //Collections.nCopies() - Tạo danh sách có các phần tử trùng nhau
        List duplicatedList = Collections.nCopies(3,dataTypeList.get(0));
        System.out.println(duplicatedList);

        //Stream API
        List numbers = Stream.of(1, 2,3,4,5).collect(Collectors.toList());
        System.out.println(numbers);

    }
}
