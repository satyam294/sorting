import java.util.Arrays;

public class InsertionSort{
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main( String[] args){
        int[] arr = new int[]{15,5,23,6,2,13,35,23,67,44,52};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}