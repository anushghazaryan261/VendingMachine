package problem13;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors1=new ArrayList<>();
        colors1.add("green");
        colors1.add("blue");
        colors1.add("yellow");
        ArrayList<String> colors2=new ArrayList<>();
        colors2.add("purple");
        colors2.add("black");
        colors2.add("white");
        System.out.println("before joining the first collection is" + colors1);
        System.out.println("the second collection is" + colors2);
        colors1.addAll(colors2);
        System.out.println("after joining" + colors1);
    }
}
