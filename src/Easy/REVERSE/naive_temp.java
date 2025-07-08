package Easy.REVERSE;

public class naive_temp {
    static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1]; // compy in reverse
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i]; //copy back to OG array
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
