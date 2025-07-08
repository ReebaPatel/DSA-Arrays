package Easy.MAX_SUBARR_SUM;

public class kadane {
    static int maxSubarrSum(int[] arr) {
        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], arr[i] + maxEnding);
            res = Math.max(maxEnding, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxSubarrSum(arr));

    }
}
