import java.util.Arrays;

public class selectionClass {
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int min= i;
            for(int j=i+1; j<n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int first = arr[min];
            arr[min] = arr[i];
            arr[i] = first;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] array = {30,40,12,20,66,50,70};
        selectionSort(array);
    }
}
