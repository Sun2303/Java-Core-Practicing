package javacore.ArrayAndList;

public class CountTheNumberOfDuplicatedValue {
    public static void main(String[] args) {
        String[] name = {"Sun", "Nhung", "Sun", "Tester", "SUN"};
        String searchName = "Sun";
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(searchName)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
