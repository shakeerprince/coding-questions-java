class ReverseString{
    public static void main(String[] args) {
        String str = " H e l l o ";
       char[] arr = str.toCharArray();

        int i = 0;
        int j = str.length() -1;

        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(arr);
    }
}