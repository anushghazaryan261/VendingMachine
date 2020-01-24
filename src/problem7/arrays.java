package problem7;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");
        if(colors.contains("green")){
            System.out.println("Contains!!");
        }
        else{
            System.out.println("Does not contain!");
        }
    }
}
