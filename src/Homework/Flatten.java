package Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();
        ArrayList<String> strings=new ArrayList<>();
        strings.add("My");
        strings.add("name");
        strings.add("is");
        strings.add("John");
        strings.add("Doe");
        ArrayList<String> strings1=new ArrayList<>();
        strings1.add("i");
        strings1.add("love");
        strings1.add("my");
        strings1.add("life");
        arrayLists.add(0,strings);
        arrayLists.add(1,strings1);
        System.out.println(arrayLists);
        List<String> collect = arrayLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
