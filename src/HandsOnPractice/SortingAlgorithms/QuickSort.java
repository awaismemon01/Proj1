package HandsOnPractice.SortingAlgorithms;


public class QuickSort {

    static int partition(int[] array, int low, int high, int choice){
        int pivot = array[high];

        int i = (low-1);
        if(choice==1) {
            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {

                    ++i;
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        else if(choice==2){
            for (int j = low; j < high; j++) {
                if (array[j] >= pivot) {

                    ++i;
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }



    static void quickSort(int[] array, int low, int high, int choice){
        if(low<high){

            int pi = partition(array,low,high,choice);

            quickSort(array,low,(pi-1),choice);
            quickSort(array,(pi+1),high,choice);

        }

    }
}
