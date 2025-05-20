public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while(num != 0){
            int digit = num % 10;
            result = result + (int)Math.pow(digit, digits);
            num = num / 10;
        }
        if(original == result){
            System.out.println(original + " is an Armstrong number");
        }else{
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
