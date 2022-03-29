package HandsOnPractice.SortingAlgorithms;


public class BubbleSort {
    static void sort(int[] array, int sortOrder) {
        int size = array.length;




        for (int i = 0; i < size - 1; i++) {

            for (int j = 0; j < size - 1; j++) {
                if (sortOrder == 1) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;

                    }
                } else {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }
}
