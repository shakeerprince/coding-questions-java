
/*
 * Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            
        
        int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
        }
    }

    public static void rotate(int[] nums, int k){
           k =k % nums.length;

           reverse(nums, 0, nums.length - 1);
           reverse(nums, 0, k - 1);
           reverse(nums, k, nums.length - 1);

    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
      
       rotate(nums, k);

       for(int i = 0; i < nums.length; i++){
        System.out.println(nums[i] + " ");
       }

    }
    
}

/*
 * import java.util.Arrays;

public class RotateArray {
    // Reverse function
    public static void reverse(int[] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate function
    public static void rotate(int[] nums, int k){
        k = k % nums.length; // Handle case when k > nums.length

        // Step 1: Reverse entire array
        reverse(nums, 0, nums.length - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Rotate the array
        rotate(nums, k);

        // Print rotated array
        System.out.println(Arrays.toString(nums)); // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}

 */
