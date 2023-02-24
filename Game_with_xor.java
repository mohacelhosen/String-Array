import java.util.Arrays;

public class Game_with_xor {
    public static void main(String[] args) {
        int[] arr ={10, 11, 1, 2, 3};
        int[] test = game_with_number(arr, 5);
        System.out.println(Arrays.toString(test));
    }
    public static int[] game_with_number (int arr[], int n) {
        int[] narr = new int[arr.length];
        for(int i=0; i<arr.length-1; i++){
            narr[i]= arr[i] ^ arr[i+1];
        }
        narr[arr.length-1]=arr[arr.length-1];
        return narr;
    }
}
