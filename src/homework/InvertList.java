package homework;

import java.util.ArrayList;
import java.util.List;

public class InvertList {

    public static List<Integer> shuffle(List<Integer> myList) {
        List<Integer> invertList = new ArrayList<>();
        for (int i = myList.size() - 1; i >= 0; i--) {
            invertList.add(myList.get(i));
        }
        return invertList;
    }
}
