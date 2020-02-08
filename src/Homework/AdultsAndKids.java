package Homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class AdultsAndKids {
    public static void main(String[] args) {
        Person sara= new Person(4,"Sara");
        Person viktor=new Person(40,"Viktor");
        Person eva=new Person(42,"Eva");
        Person anna=new Person(5,"Anna");
        List<Person> list=asList(sara,viktor,eva,anna);
        List<Person> adults = list.stream().filter(p -> p.getAge() >= 18).collect(Collectors.toList());
        List<Person> kids = list.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());
        Map<Boolean,List<Person>> grouped=new HashMap<>();
        grouped.put(true,adults);
        grouped.put(false,kids);
        System.out.println(grouped);
    }
}
