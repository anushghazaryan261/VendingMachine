package Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Oldest {
    public static void main(String[] args) {
        ArrayList<Person> people=new ArrayList<>();
        Person person1=new Person(14,"Armen");
        Person person2=new Person(34,"Karen");
        Person person3=new Person(10,"Hayk");
        Person person4=new Person(25,"Varduhi");
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        System.out.println(people);
        Person oldest = people.stream().max(Comparator.comparingInt(Person::getAge)).orElse(null);
        System.out.println(oldest);
    }
}
