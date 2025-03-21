import java.util.*;


// /Input: [7, 8, 7, 9, 8, 10, 9]  
// Output: 10
public class AllUnique {
    public static void main(String[] args) {
        HashMap <Integer, Integer> map  = new HashMap<>();
        int[] arr = {7, 8, 7, 9, 8, 10, 9};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(int i = 0; i< n; i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
            } 
        }
    }
    
}
