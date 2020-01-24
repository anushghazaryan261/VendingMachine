package problem2;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        ArrayList<String> someArray=new ArrayList<>();
        someArray.add("first");
        someArray.add("second");
        someArray.add("third");
        for (String s : someArray) {
            System.out.println(s);
        }
    }
}
