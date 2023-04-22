package org.example;


import java.util.List;

public class NumberName {

private static final String name = "1. Sasha, 2. Dima, 3. Vova, 4. Dasha, 5. Misha, ";
    static List<String> names = List.of(name.split("\\d\\W\\s"));

    public static String Names(List<String> nameArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if (!(i % 2 == 0)) {
                sb.append(i).append(". ").append(names.get(i));
            }
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(Names(names));

    }
}