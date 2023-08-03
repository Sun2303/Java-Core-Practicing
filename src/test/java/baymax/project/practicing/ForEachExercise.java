package baymax.project.practicing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachExercise {
    public static void main(String[] args) {
        /*List<Identification> studentList = Arrays.asList(
                new Identification("Son", "Nguyen"),
                new Identification("Duong", "Le"),
                new Identification("Sun", "Tran"),
                new Identification("Hoang", "Quach")
        );

        //lambda syntax (tham số) -> {thân hàm}
        studentList.forEach(student -> {
            System.out.println("Danh sách học sinh: " + student.getFirstName() + " " + student.getLastName());
        } );
        //method reference
        studentList.forEach((System.out::println));*/

        int a = 3;
        int b = 2;
        System.out.println((float)a/b);

        Integer number01 = 3;
        System.out.println(Integer.MAX_VALUE);
        Long longNumber = Long.valueOf("123");
        /*Byte byteNumber = Byte.valueOf("Name");*/
        System.out.println(longNumber);
        char text = 'a' + 1;
        System.out.println(text);
        String ten = "Sun";

        System.out.println(Math.PI);

    }
}
