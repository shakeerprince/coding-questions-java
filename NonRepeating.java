import java.util.*;

//1. Find the First Non-Repeating Element
//Input: [1, 2, 3, 4, 2, 3, 1] //Output: 4  
        

public class NonRepeating {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {1, 2, 3, 4, 2, 3, 1, 4,7};
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
            }


            for(int i = 0; i<n; i++){
            if(map.get(arr[i]) == 1){
                System.out.println(arr[i]);
                
            }
        }
        }
}

