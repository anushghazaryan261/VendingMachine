package Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class GetKidNames {
    public static void main(String[] args) {
        Person sara= new Person(4,"Sara");
        Person viktor=new Person(40,"Viktor");
        Person eva=new Person(42,"Eva");
        Person anna=new Person(5,"Anna");
        List<Person> all=asList(sara,viktor,eva,anna);
        System.out.println(all);
        List<Person> kids = all.stream().filter(person -> person.getAge() < 18).collect(Collectors.toList());
        kids.forEach(each-> System.out.println(each.getName()));
    }
}
