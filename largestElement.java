/**
 * Example 1:
Input:
 arr[] = {2,5,1,3,0};
Output:
 5
Explanation:
 5 is the largest element in the array. 

Example2:
Input:
 arr[] = {8,10,5,7,9};
Output:
 10
Explanation:
 10 is the largest element in the array. 
 */

 import java.util.*;
class largestElement{
    public static void main(String[] args){
      //   int[] arr = {8,10,15,7,9};
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n = sc.nextInt();
        int[] arr = new int[n]; 
        System.out.println("Enter the "+ n + " elements of array");
       for(int i = 0; i< n; i++){
        arr[i] = sc.nextInt();
       }


         int largest = arr[0];
         for(int i =1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
         }
         System.out.println(largest);
    }
}