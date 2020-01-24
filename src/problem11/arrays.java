package problem11;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        ArrayList<String> secondArray=new ArrayList<>();
        secondArray.add("green");
        secondArray.add("blue");
        secondArray.add("yellow");
        if(colors.equals(secondArray)){
            System.out.println("two arrays are equal");
        }
        else{
            System.out.println("two arrays are not equal");
        }
    }
}
