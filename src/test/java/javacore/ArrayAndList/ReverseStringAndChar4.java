package javacore.ArrayAndList;

public class ReverseStringAndChar4 {
    public static void main(String[] args) {
        String name = "Sun SCD";
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }
        System.out.println(reverseName);

    }
}
