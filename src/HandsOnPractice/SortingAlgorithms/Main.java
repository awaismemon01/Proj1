package HandsOnPractice.SortingAlgorithms;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int []data = new int[7];
        for (int i=0; i< data.length; i++){
            data[i] = (int) (Math.random()*100);
        }

        System.out.println("Original array : "+ Arrays.toString(data));
        System.out.println("1. Bubble Sort\n2. Quick Sort\n3. Merge Sort");
        Scanner scanner = new Scanner(System.in);
        int sort = scanner.nextInt();

        System.out.println("Choose Sorting Order:");
        System.out.println("1 for Ascending \n2 for Descending");
        int choice = scanner.nextInt();

        switch (sort){
            case 1: {
                BubbleSort.sort(data,choice);
                System.out.println("Sorted array : "+ Arrays.toString(data));
                break;
            }

            case 2: {
                QuickSort.quickSort(data,0,data.length-1,choice);
                System.out.println("Sorted array : "+ Arrays.toString(data));
                break;
            }

            case 3: {
                MergeSort.mergesort(data,0, data.length-1,choice);
                System.out.println("Sorted array : "+ Arrays.toString(data));
                break;
            }
            default:
                System.out.println("Error");
        }

        if(choice==1) {
            System.out.print("Enter a number to search in the array : ");
            int number = scanner.nextInt();
            int result = BinarySearch.binarySearch(data, number, 0, data.length - 1);
            if (result == -1)
                System.out.println("Not Found");
            else
                System.out.println("The number is present at index : " + result);
        }
    }
}
