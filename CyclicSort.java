import java.util.Arrays;

public class CyclicSort {
    public static void cyclicSort(int[] arr, int n){
        int i = 0;
        while(i < n-1){
            if(arr[i] != i+1){
                int ind = arr[i] - 1;
                swap(arr, i, ind);
            }
            else{
                i++;
            }
           
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = new int[]{5,4,3,2,1,6,9,8,7};
        cyclicSort(arr,9);
        System.out.println(Arrays.toString(arr));
    }
}
