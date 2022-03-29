package HandsOnPractice;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {

    public static void main(String[] args) {

        String[] names = {"Java","C","Ruby","Python"};

//      Long Method

//        for (int i=0; i< names.length-1; i++){
//
//            for (int j=i+1; j< names.length; j++){
//
//                if(names[i].compareTo(names[j])>0){
//
//                    String temp = names[i];
//                    names[i] = names[j];
//                    names[j] = temp;
//
//                }
//            }
//        }


        //Use of Arrays class and Comparator
        Arrays.sort(names,Comparator.naturalOrder());

        System.out.println(Arrays.toString(names));

    }
}
