package HandsOnPractice.SortingAlgorithms;

public class BinarySearch {
    static int binarySearch(int[] arr, int element, int low, int high){
        while (low<=high){

            int mid = low+(high-low)/2;

            if(arr[mid]==element)
                return mid;

            if(arr[mid]>element)
                high = mid-1;

            else
                low = mid+1;
        }
        return -1;
    }

}
