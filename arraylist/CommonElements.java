package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        System.out.println("Common elements: " + commonElements);
    }
}