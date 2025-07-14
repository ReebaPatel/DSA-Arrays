package Easy.FIND_DUPES;

import java.util.Arrays;

public class sorted_arr {
    static boolean finddupe(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(finddupe(arr));
    }
}
