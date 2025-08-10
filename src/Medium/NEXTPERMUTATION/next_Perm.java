package Medium.NEXTPERMUTATION;

public class next_Perm {

    public static void findNextPerm(int arr[]) {
        int pivot = -1;
        int n = arr.length;
        for (int i = n - 2; i > 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverseArray(arr, 0, n-1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap_elems(arr, i, pivot);
                break;
            }
        }
        reverseArray(arr, pivot + 1,n -1);
    }

    public static void reverseArray(int arr[], int i, int j) {
          while (i < j) {
            swap_elems(arr, i,j);
            i++;
            j--;
        }
    }

    public static void swap_elems(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 7, 5, 0 };
        findNextPerm(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
