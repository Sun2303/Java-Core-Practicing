package baymax.project.practicing;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<Identification> studentList = new ArrayList<>();
        studentList.add(new Identification("Sung", "Le"));
        studentList.add(new Identification("Son", "Nguyen"));
        studentList.add(new Identification("Duong", "Tran"));
        studentList.add(new Identification("Han", "Nguyen"));
        studentList.add(new Identification("Minh", "Nguyen"));

        for(Identification student : studentList){
            if(student.getLastName().equals("Nguyen")){
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
    }
}
