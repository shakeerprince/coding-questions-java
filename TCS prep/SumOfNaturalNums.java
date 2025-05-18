
public class SumOfNaturalNums {
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        System.out.println(Formula(n));
    }
    static int  Formula(int n){
       return n* (n+1) /2;    
}
}

