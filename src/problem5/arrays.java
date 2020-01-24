package problem5;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String > someArray=new ArrayList<>();
        someArray.add("first");
        someArray.add("second");
        someArray.add("third");
        System.out.println("before update");
        System.out.println(someArray);
        someArray.set(0,"updated!!");
        System.out.println("after update");
        System.out.println(someArray);
    }
}
