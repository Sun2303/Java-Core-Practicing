package baymax.project.practicing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        List<Identification> studentList = new ArrayList<>();
        studentList.add(new Identification("Sung", "Le"));
        studentList.add(new Identification("Son", "Nguyen"));
        studentList.add(new Identification("Duong", "Tran"));
        studentList.add(new Identification("Han", "Nguyen"));
        studentList.add(new Identification("Minh", "Nguyen"));
        studentList.add(new Identification("Duc", "Nguyen"));

        //For loop
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Thông tin của người thứ " + i + " trong danh sách là: " + studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
        }

        System.out.println("Danh sách các học sinh có họ Nguyễn:");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getLastName().equals("Nguyen")) {
                System.out.println(studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
            }
        }
        //While loop
        int number = 0;
        while (number < studentList.size()) {
            if (studentList.get(number).getLastName().equals("Nguyen")) {
                System.out.println(studentList.get(number).getFirstName() + " " + studentList.get(number).getLastName());
            }
            number++;
        }

        //for Each loop
        for (Identification student : studentList) {
            if (student.getLastName().equals("Nguyen")) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }

        //Do-While loop
        //Example 01:
        int stt = 0;
        do {
            System.out.println(studentList.get(stt).getFirstName() + " " + studentList.get(stt).getLastName());
            stt++;
        } while (stt < studentList.size());

        //Example 02:
        double value = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Please enter your score: ");
            value = input.nextDouble();
            System.out.println("Your score is: " + value);
        }while(value > 0 && value <= 10);
        System.out.println("Invalid value. Please input the correct score!");
    }
}
