package Easy.REVERSE;

public class recursion {
    static void revArr(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        // swap elems at ends

        revArr(arr, l + 1, r - 1); // recur for remaining arr

    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        revArr(arr, 0, n - 1);
    } //public facing helper fucniton

     public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }

}
