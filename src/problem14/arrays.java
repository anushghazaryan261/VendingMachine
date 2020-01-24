package problem14;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        ArrayList<String> colors2= (ArrayList<String>) colors.clone();
        System.out.println("The initial array" + colors);
        System.out.println("The clone" + colors2);
    }
}
