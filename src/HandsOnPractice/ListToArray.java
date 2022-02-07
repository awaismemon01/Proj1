package HandsOnPractice;

import java.util.ArrayList;
import java.util.List;

//Java program to convert List to Array

public class ListToArray {
    public static void main(String[] args) {

        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("DotNet");
        languages.add("JavaScript");
        languages.add("C#");

        String[] array = new String[languages.size()];
        languages.toArray(array);

        for (String item:
             array) {
            System.out.print(item+" ");
        }

    }
}
