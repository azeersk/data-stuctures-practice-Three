import java.util.Arrays;

public class bubbleClass {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    int first = arr[i];
                    int second = arr[j];
                    arr[i] = second;
                    arr[j] = first;
                }
            }
        }

        System.out.println("sorted array is: "+ Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] array = {9,8,4,12,7,20};
        System.out.println("Sorted array using bubble sort: ");
        bubbleSort(array);
    }
}
