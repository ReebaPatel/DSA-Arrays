package Easy.MINMAX;

import java.util.Arrays;

class Pair{
    public int min;
    public int max;
}
public class sorting {
    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n-1];
        return minmax;
    }
    public static void main(String[] args){
        int arr[] = { 1000, 11, 445, 1 , 330, 3000 };
        int arr_Size = arr.length;
    Pair minmax = getMinMax(arr, arr_Size);
    System.out.println("Minimum element: " +minmax.min);
    System.out.println("Maximum element: "+minmax.max);
    }
}
