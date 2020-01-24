package problem9;

import java.util.ArrayList;
import java.util.Collections;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        ArrayList<String> secondArray=new ArrayList<>();
        secondArray.add("first");
        secondArray.add("second");
        secondArray.add("third");
        System.out.println("before copying");
        System.out.println("first array contains" + colors);
        System.out.println("second array contains" + secondArray);
        Collections.copy(secondArray,colors);
        System.out.println("after copying");
        System.out.println("first array contains" + colors);
        System.out.println("second array contains" + secondArray);

    }
}
