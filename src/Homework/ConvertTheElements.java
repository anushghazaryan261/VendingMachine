package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertTheElements {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("i");
        strings.add("love");
        strings.add("my");
        strings.add("life");
        System.out.println(strings);
        List<String> collect = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }
}
