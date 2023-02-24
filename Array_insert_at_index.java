import java.util.Scanner;
import java.util.Arrays;

/*🌲🌳🌴---------------------------------------
        Input:
        sizeOfArray = 6
        arr[] = {1, 2, 3, 4, 5}
        index = 2, element = 90
        Output: 1 2 90 3 4 5
        Explanation: 90 is inserted at index
        2(0-based indexing). After inserting,
        array elements are like
        1, 2, 90, 3, 4, 5.
----------------------------------------🌴🌳🌲*/
public class Array_insert_at_index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i=0; i<sizeOfArray-1; i++ ){
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter index number & value: ");
        int index = in.nextInt();
        int value = in.nextInt();
        int temp = index;
        if (index != arr.length - 1) {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
        }
        arr[index]=value;
        System.out.println(Arrays.toString(arr));
    }
}
