package problem8;

import java.util.ArrayList;
import java.util.Collections;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("before sorting");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println("after sorting");
        System.out.println(colors);
    }
}
