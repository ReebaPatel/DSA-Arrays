package Medium.MISSING_REPEATED;

import java.util.ArrayList;

public class array_marking {
    static ArrayList<Integer> FindTwoElements(int arr[]) {
        int n = arr.length; // Array ka size (jaise arr = [3, 1, 3])

        int rep = -1; // Repeat hone wala number store karega (-1 matlab abhi tak nahi mila)
        
        // STEP 1: Repeat number dhundhne ka kaam
        for (int i = 0; i < n; i++) {
            
            // Math.abs() se element ka original positive value lete hai
            // kyunki hum niche negative mark karenge
            int val = Math.abs(arr[i]); 
            
            // val - 1 isliye kyunki array index 0 se start hota hai
            if (arr[val - 1] > 0) {
                // Agar positive hai → pehli baar mila → negative mark karo (visited)
                arr[val - 1] = -arr[val - 1];
            } 
            else {
                // Agar already negative hai → pehle visit ho chuka hai → repeat number hai
                rep = val;
            }
        }

        // STEP 2: Missing number dhundhna
        int mis = -1;
        for (int i = 0; i < n; i++) {
            // Jo index abhi bhi positive hai → kabhi visit nahi hua → missing number
            if (arr[i] > 0) {
                mis = i + 1; // index se number banane ke liye +1 karte hai
                break;
            }
        }

        // Answer list me store karo [repeat, missing]
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(rep);
        ans.add(mis);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 3};
        System.out.println(FindTwoElements(arr));
    }
}
