package Easy.MAX_SUBARR_SUM;

public class naive {
    static int maxSubarrSum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum += arr[j];
                res = Math.max(res, currSum);
            }
        }   
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
        System.out.println(maxSubarrSum(arr));
    }
}
