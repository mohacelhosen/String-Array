/*

|-----------------------------------------------|
|    Example 1:                                 |
|    -----------                                |
|                                               |
|    Input:                                     |
|    sizeOfArray = 6                            |
|    arr[] = {1, 2, 3, 4, 5}                    |
|    element = 90                               |
|    Output: 1 2 3 4 5 90                       |
|    Explanation: After inserting 90 at the     |
|    end, we have array elements as             |
|    1 2 3 4 5 90.                              |
------------------------------------------------|

|-----------------------------------------------|
|  Example 2:                                   |
|  --------------                               |
|                                               |
|  Input:                                       |
|  sizeOfArray = 4                              |
|  arr[] = {1, 2, 3}                            |
|  element = 50                                 |
|  Output: 1 2 3 50                             |
|  Explanation: After inserting 50 at the       |
|  end, we have array elements as               |
|  1 2 3 50.                                    |
|_______________________________________________|


    🌲🌳🌴Your Task:🌴🌳🌲
===========================
    You are given an array arr.
    The size of the array is given by sizeOfArray.
    You need to insert an element at the end.

Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).
*/


import java.util.Arrays;
import java.util.Scanner;

public class Array_insert_at_end {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] arr = new int[sizeOfArray];
        for (int i=0; i<sizeOfArray-1; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the last Item: ");
        int lastItem =in.nextInt();
        arr[sizeOfArray-1]=lastItem;
        for (int eachItem: arr){
            System.out.printf(eachItem+" ");
        }
    }
}