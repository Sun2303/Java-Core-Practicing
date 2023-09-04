package javacore.ArrayAndList;

public class SortNumberDescending {
    public static void main(String[] args) {
        int[] num = {1, 52, 8, 17, 33, 49, 62, 8};
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

}
