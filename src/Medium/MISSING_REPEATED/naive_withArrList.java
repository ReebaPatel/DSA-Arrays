package Medium.MISSING_REPEATED;

import java.util.ArrayList;

public class naive_withArrList {
    static ArrayList<Integer> FindTwoElements(int[] arr){
        int n = arr.length;
        int freq[] = new int[n+1]; //
        int rep = -1;
        int mis = -1;
        for (int i = 0; i <n; i++){
            freq[arr[i]]++;
        }
        for (int i = 0; i <= n; i++){
            if (freq[i] == 0){
                mis = i;
            } else if(freq[i] == 2) {
                rep = i;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(rep);
        res.add(mis);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 3};
        System.out.println(FindTwoElements(arr));
    }
}
