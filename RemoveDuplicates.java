

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3};

        int k = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1 ]){
                arr[k] = arr[i];
                k = k + 1;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
