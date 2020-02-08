package Homework;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(71);
        numbers.add(-3);
        numbers.add(13);
        System.out.println(numbers);
        Integer sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
