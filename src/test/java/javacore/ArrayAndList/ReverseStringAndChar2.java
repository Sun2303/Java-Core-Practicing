package javacore.ArrayAndList;

public class ReverseStringAndChar2 {
    public static void main(String[] args) {
        String name = "Nhung Pham";
        char[] result = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            result[i] = name.charAt(i);
        }
        System.out.println(result);
        for(int j = result.length-1; j>=0;j--){
            System.out.print(result[j]);
        }
    }
}
