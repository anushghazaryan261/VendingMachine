package Homework;

import Homework.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ByNationality {
    public static void main(String[] args) {
        Person sara= new Person(4,"Sara");
        sara.setNationality("Norwegian");
        Person viktor=new Person(40,"Viktor");
        viktor.setNationality("Serbian");
        Person eva=new Person(42,"Eva");
        eva.setNationality("Norwegian");
        List<Person> list=asList(sara,viktor,eva);
        System.out.println(list);
        Map<String,List<Person>> byNationality=list.stream()
                                                   .collect(Collectors
                                                   .groupingBy(Person::getNationality));
        System.out.println(byNationality);
    }
}
