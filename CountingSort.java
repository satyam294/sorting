import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        int[] freq = new int[max+1];

        for(int i = 0 ; i < arr.length; i++){
            freq[arr[i]]++;
        }

        // finding cumulative frequency

        int sum = freq[0];
        for(int i = 1 ; i < freq.length;i++){
            sum += freq[i];
            freq[i] = sum;
        }

        int[] output = new int[arr.length];

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            int ind = freq[arr[i]] --;
            output[ind -1] = arr[i];
        }

        return output;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1 ; i < arr.length ; i++){
            if(arr[i] > max) 
                max = arr[i];
        }
        return max;
    }
    public static void main( String[] args){
        int[] arr = new int[]{15,5,23,6,2,13,35,23,67,44,52};
        int[] sorted = countingSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

}
