import java.util.Arrays;

public class insertionClass {
    public static void insertionSort(int[] arr){

        int n = arr.length;
        for(int i=1; i<n; i++){
            int current = arr[i];
            int j = i-1;

            while (j>=0 && current<arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args){
        int[] arr = {30,40,12,20,66,50,70};
        System.out.println("Sorted the array using insertion sort: ");
        insertionSort(arr);
    }
}
// insertion sort
// merge sort
// divide and conquer rule
// quick sort
// heap sort