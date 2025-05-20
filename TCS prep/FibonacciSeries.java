public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20;
        int a = 0;
        int b = 1;

        for(int i = 2; i < n; i++){
            int next = a + b;
             System.out.print(next + " ");
            a = b;
            b = next;
           
        }
    }
}
