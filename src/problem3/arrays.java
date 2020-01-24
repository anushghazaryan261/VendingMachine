package problem3;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> someArray=new ArrayList<>();
        someArray.add("first");
        someArray.add("second");
        someArray.add("third");
        System.out.println("before changes");
        System.out.println(someArray);
        someArray.add(0,"inserting at first position");
        System.out.println("after changes");
        System.out.println(someArray);
    }
}
