import java.util.*;
public class repeating {

    private static void solver(int[] arr, int n ){
      HashSet<Integer> set = new HashSet<>();
      HashSet<Integer> dup = new HashSet<>();

            for(int i = 0; i< n; i++){
                if(set.contains(arr[i])){
                    dup.add(arr[i]);
                }else{
                    set.add(arr[i]);
                }
            }

            for(int num : dup){
                System.out.println(num);
            }

     }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,3,4,1,8,9,0,0};
        int n = arr.length;
        solver(arr, n);
    }
}
