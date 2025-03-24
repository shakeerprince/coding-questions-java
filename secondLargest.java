public class secondLargest {
    public static void main(String[] args){
        int[] arr = {12, 45, 7, 65, 54, 89, 23, 45};

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);

    }
}
