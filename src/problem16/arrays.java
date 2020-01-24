package problem16;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        if(colors.isEmpty()){
            System.out.println("is empty");
        }
        else{
            System.out.println("is not empty");
        }
    }
}
