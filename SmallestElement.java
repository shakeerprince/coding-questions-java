/*Find the smallest element in an array

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.

*/
public class SmallestElement {
    public static void main(String[] args){
       int[] arr = {8,10,51,7,9};
        int smallest = arr[0];
        
        for(int i = 0; i < arr.length-1; i++){
          if(arr[i] < smallest){
            smallest = arr[i];
          }
        }
        System.out.println(smallest);
    }
}
