package problem6;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("before deleting the third element");
        System.out.println(colors);
        colors.remove(2);
        System.out.println("after deleting the third element");
        System.out.println(colors);
    }
}
