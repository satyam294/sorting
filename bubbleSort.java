import java.util.Arrays;
public class bubbleSort{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            boolean swapped = false;
            for(int j = 0 ; j < n - 1 - i ; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main( String[] args){
        int[] arr = new int[]{15,5,23,6,2,13,35,23,67,44,52};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}