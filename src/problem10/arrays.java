package problem10;

import java.util.ArrayList;
import java.util.Collections;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("before reversing" + colors);
        Collections.reverse(colors);
        System.out.println("after reversing" + colors);
    }
}
