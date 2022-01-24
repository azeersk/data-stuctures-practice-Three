public class mergeClassOne {
    public static void merge(int arr[], int l, int mid, int r){
        int n = mid-l+1;
        int m = r-mid;

        int L[] = new int[n];
        int M[] = new int[m];

        for(int i=0; i<n; i++){
            L[i] = arr[l+i];
        }

        for(int j=0; j<m; j++){
            M[j] = arr[mid+1+j];
        }

        int i,j,k;
        i = 0;
        j = 0;
        k = l;

        while(i<n && j<m){
            if(L[i] <= M[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while(i<n){
            arr[k] = M[i];
            i++;
            k++;
        }
        while (j<m){
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    public static void mergeSortAlgo(int[] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSortAlgo(arr,l,mid);
            mergeSortAlgo(arr,mid+1,r);

            merge(arr,l,mid,r);
        }

    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] array = {30,40,12,20,66,50,70};
        System.out.println("Sorted array using merge sort: ");
        mergeClassOne obj = new mergeClassOne();
        int len = array.length-1;
        obj.mergeSortAlgo(array,0,len);
        printArray(array);
        System.out.println("Sorted array: ");

    }
}
