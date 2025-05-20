public class PalindromeDigit {
    public static void main(String[] args) {
        
    int originalDigit = 67437438;
    int reversedDigit = 0;
    int temp = originalDigit;

    while(temp != 0){
        int lastDigit = temp % 10;
        reversedDigit = reversedDigit * 10 + lastDigit;
        temp = temp /10;

        
    }
    System.out.println("Original Digit = "+ originalDigit);
    System.out.println("Reversed Digit = "+ reversedDigit);

    if(originalDigit == reversedDigit){
        System.out.println(originalDigit + " is a palindrome");
    }else{
        System.out.println(originalDigit + " is not a palindrome");
    }
}
}