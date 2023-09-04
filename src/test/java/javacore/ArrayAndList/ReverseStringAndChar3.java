package javacore.ArrayAndList;

public class ReverseStringAndChar3 {
    public static void main(String[] args) {
        String name = "Sun SCD";
        StringBuilder reserveName = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reserveName.append(name.charAt(i));
        }
        System.out.println(reserveName);
        reserveName.reverse();
        System.out.println(reserveName);
    }
}
