public class linearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 4;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key " + key + " found at index " + i);
            }
        }

    }
}
