package Easy.SORTED_ROTATED_ARR;

public class naive_linear {
  
    public static int search(int array[],int size,int target ){
        for (int i = 0; i < size ; i++){
            if(array[i]==target){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {8, 9, 10, 0, 1, 2, 3, 4, };
        int target = 3;
        int size = array.length;
        int result = search(array, size, target);
        if(result==-1){
            System.out.println("Element not found in the array");
        } else{
            System.out.println("Element found at index " +result);
        }

    }
}
