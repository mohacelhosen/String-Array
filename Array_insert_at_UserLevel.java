import java.util.Scanner;
import java.util.Arrays;
public class Array_insert_at_UserLevel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}