package HandsOnPractice.SortingAlgorithms;

public class MergeSort {

    static void merge(int[] arr, int p, int q, int r, int choice){

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] M;
        M = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = arr[p+i];
        }
        for(int i=0; i<n2; i++){
            M[i] = arr[q+1+i];
        }

        int i=0,j=0,k=p;

        while (i<n1 && j<n2){
            if(choice==1) {
                if (L[i] <= M[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = M[j];
                    j++;
                }
            }
            else{
                if (L[i] > M[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = M[j];
                    j++;
                }
            }
            k++;
        }

        while (i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k] = M[j];
            j++;
            k++;
        }
    }


    static void mergesort(int[] arr, int p, int r, int choice){
        if(p<r) {
            int mid = (p + r) / 2;

            mergesort(arr, p, mid,choice);
            mergesort(arr, mid + 1, r,choice);

            merge(arr,p,mid,r,choice);
        }
    }
}
