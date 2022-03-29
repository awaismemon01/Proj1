package HandsOnPractice;

import java.util.*;

public class ArrayToSet {
    public static void main(String[] args) {

        String[] array = {"A","B","C","D"};

        Set<String> strings = new HashSet<>(Arrays.asList(array));

        System.out.println(strings);
    }
}
