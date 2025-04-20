
import java.util.*;
public class ContainsDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean containsDuplicates = false;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i< arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
                containsDuplicates = true;
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println("containsDuplicates : " + containsDuplicates);
    }
}
