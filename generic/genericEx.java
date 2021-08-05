package generic;

import java.util.ArrayList;
import java.util.List;

public class genericEx {
    public static void main(String[] args) {
        List<?> score_math = new ArrayList<>();
        List<Integer> list_korean = new ArrayList<Integer>();
        List<Integer> list_english = new ArrayList<>();

        list_english.add(12);
//        list_korean.add("23");
    }
}
