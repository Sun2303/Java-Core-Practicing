package javacore.ArrayAndList;

public class ReverseStringAndChar3 {
    public static void main(String[] args) {
        String name = "Sun SCD";
        StringBuilder revername = new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            revername.append(name.charAt(i));
        }
        System.out.println(revername);
        revername.reverse();
        System.out.println(revername);
    }
}
