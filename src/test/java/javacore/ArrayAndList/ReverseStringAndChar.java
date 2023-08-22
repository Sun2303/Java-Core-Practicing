package javacore.ArrayAndList;

public class ReverseStringAndChar {
    public static void main(String[] args) {
        String[] arr = {"Sun", "Beo", "U", "Nu"};
        String[] arrayReverse = new String[4];
        System.out.println("The original String: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe reverse array: ");
        for (int i = arrayReverse.length - 1; i >= 0; i--) {
            arrayReverse[i] = arr[i];
            System.out.print(arrayReverse[i] + " ");
        }
    }
}
