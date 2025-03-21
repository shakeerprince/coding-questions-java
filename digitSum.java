import java.util.*;
public class digitSum {

    public static void main(String[] args) {
        
        int num = 10000;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int  i = n1; i<= n2 ; i++){
            sum = sum + i;
        }

        System.out.println(sum);

    }
}