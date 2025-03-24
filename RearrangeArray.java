/*
 * Example 1:
Input: 8 7 1 6 5 9
Output: 1 5 6 9 8 7
Explanation: First three elements are in the ascending order and next three elements are in the descending order.

Example 2:
Input: 4 2 8 6 15 5 9 20
Output: 2 4 5 6 20 15 9 8
 * 
 * 
 */

import java.util.*;
 public class RearrangeArray {
    public static void main(String[] args){

        int[] arr = {8, 7, 1, 6, 5, 9};
       // Arrays.sort(arr);
       rearrange(arr);
        System.out.println(Arrays.toString(arr));

    }    

    public static void rearrange(int[] arr){
        int n = arr.length; int mid = n/2; 



        Arrays.sort(arr);
         reverse(arr, mid, n-1);
    }
    private static void reverse(int[] arr, int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
}
