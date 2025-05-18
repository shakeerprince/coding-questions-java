public class ReverseInteger {
    public static void main(String[] args) {
        
    int rev = 0;
    int x = 121;
    
    while(x != 0){
        int digit = x % 10;
        x /= 10;
        rev = rev * 10 + digit;
    }
    System.out.println(rev);
}
}