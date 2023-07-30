package baymax.project.practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowToCreatAList {
    public static void main(String[] args) {
        //ArrayList
        List<Identification> studentList = new ArrayList<>();
        studentList.add(new Identification("Sung", "Le"));
        studentList.add(new Identification("Son", "Nguyen"));
        studentList.add(new Identification("Duong", "Tran"));
        System.out.println(studentList.size());

        //Arrays.asList()
        List fields = Arrays.asList("IT", "Service", "Logistic", "Food & Beverage");
        System.out.println(fields);

        //List.of() - java 9+
        List dataTypeList = List.of("String", "Number", "Integer", "Double");
        System.out.println(dataTypeList);

        //List.copyOf() - Java 10
        List newList = List.copyOf(fields);
        System.out.println(newList);

        //List.subList()
        List originalList = fields;
        List subList = originalList.subList(1,2);
        System.out.println(subList);

        //Collections.nCopies() - Tạo danh sách có các phần tử trùng nhau
        List duplicatedList = Collections.nCopies(3,dataTypeList.get(0));
        System.out.println(duplicatedList);

        //Stream API
        List numbers = Stream.of(1, 2,3,4,5).collect(Collectors.toList());
        System.out.println(numbers);

    }
}
