package Medium.FINDSUMPAIR;

public class twopointer {
    static boolean findpair(int[] arr, int target){
        int n = arr.length;
        int i = 0;
        for ( i = 0; i < arr.length; i++){
            if (arr[i] > arr[i+1]){
                break;
            }
        }
        int l = (i + 1) %n;
        int r = i;
          while (l != r) {

            // If we find a pair with sum target, return true
            if (arr[l] + arr[r] == target)
                return true;

            // If current pair sum is less, move to higher sum
            if (arr[l] + arr[r] < target)
                l = (l + 1) % n;

            // Move to lower sum side
            else
                r = (r - 1 + n) % n;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int target = 16;
        System.out.println(findpair(arr, 16));
         if (findpair(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
