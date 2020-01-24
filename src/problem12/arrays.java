package problem12;

import java.util.ArrayList;
import java.util.Collections;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("before swapping" + colors);
        Collections.swap(colors,0,1);
        System.out.println("after swapping" + colors);
    }
}
