package Homework;

import Homework.Person;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class NamesByComas {
    public static void main(String[] args) {
        Person sara = new Person(4, "Sara");
        Person viktor = new Person(40, "Viktor");
        Person eva = new Person(42, "Eva");
        Person anna = new Person(5, "Anna");
        List<Person> list = asList(sara, viktor, eva, anna);
        System.out.println(list);
        List<String> names = list.stream().map(p -> {
            if(list.get(list.size()-1).equals(p)){
                return p.getName() + ". ";
            }else{
                return p.getName() + ", ";
            }
        }).collect(Collectors.toList());
        names.forEach(System.out::print);

    }
}
