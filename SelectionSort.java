import java.util.*;

class Main{
    public static void SelectionSort(String[] args){
        int[] arr = {8,7,5,4,3,2,1};
        
        for(int i = 0; i < arr.length; i++){
            int min = i;
            
            for(int j = i + 1; j < arr.length; j++){
                
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
        
        System.out.println(Arrays.toString(arr));
    }
}