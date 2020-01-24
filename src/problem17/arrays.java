package problem17;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("purple");
        colors.add("yellow");
        System.out.println("before replacement" + colors);
        replaceTheSecondElement(colors,3);
        System.out.println("after replacement" +colors);
    }
    private static void replaceTheSecondElement(ArrayList<String> someArray, int index){
        someArray.set(1,someArray.get(index));
    }
}
