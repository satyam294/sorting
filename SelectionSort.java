import java.util.Arrays;

public class SelectionSort{
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1 ; i++){
            int smallestInd = i;
            for(int j = i+1 ; j< n ; j++ ){
                if(arr[j] < arr[smallestInd]){
                    smallestInd = j;
                }
            }
            if(smallestInd != i){
                swap(arr, i, smallestInd);
            }
        } 
    }
    public static void swap( int[] arr, int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     public static void main(String[] args){
        int[] nums = new int[]{12,34,21,3,15,22,13,65,73,43};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
     }
}