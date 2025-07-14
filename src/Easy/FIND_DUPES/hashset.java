package Easy.FIND_DUPES;
import java.util.HashSet;
import java.util.Set;

public class hashset {
    static boolean findDupes(int[] arr){
        int n = arr.length;
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++){
            if(st.contains(arr[i]))
            return true;
            else
            st.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {4, 6, 5 ,4 };
        System.out.println(findDupes(arr));
    }
}
