public class Prime {
    public static void main(String[] args) {
        boolean prime = true;
        int num = 10;

        for (int i = 2; i< Math.sqrt(num); i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(num + " "+ "is a prime number");
        }else {
            System.out.println(num + " "+  "is not a prime number");
        }
    }
}
