import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr =  {0,43,5,6,0,4,0,12,3};
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = 0;
               arr[j] = temp;
               j++;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        
    }
}
