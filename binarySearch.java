public class binarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 6;
        
        int index = binarySearch(array, key);
        if(index != -1){
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }
    
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        
        while(low <= high){
            // Correct midpoint calculation
            int mid = low + (high - low) / 2;
            
            if(array[mid] == key) {
                return mid;
            } else if(array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Key not found
    }
}
