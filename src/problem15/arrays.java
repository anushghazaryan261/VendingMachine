package problem15;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        System.out.println("before clearing " + colors);
        colors.clear();
        System.out.println("after clearing " + colors);
    }
}
