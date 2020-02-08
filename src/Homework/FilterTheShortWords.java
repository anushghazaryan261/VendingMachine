package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTheShortWords {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("My");
        strings.add("name");
        strings.add("is");
        strings.add("John");
        strings.add("Doe");
        System.out.println(strings);
        List<String> collect = strings.stream().filter(str -> str.length() < 4).collect(Collectors.toList());
        System.out.println(collect);
    }
}
