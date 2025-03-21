import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        int pizza = 100;
        int puffs = 20;
        int coolDrink = 10;

        System.out.println("Enter the no of pizzas bought : ");
        Scanner sc = new Scanner(System.in);
        int No_of_pizzas = sc.nextInt();

        System.out.println("Enter the no oof puffs bought : ");
        int No_of_puffs = sc.nextInt();


        System.out.println("Enter the no of cool drinks bought : ");
        int No_of_coolDrinks = sc.nextInt();


        int p = pizza * No_of_pizzas;
        int pu = puffs * No_of_puffs;
        int c = coolDrink * No_of_coolDrinks;

        int totalBill = p+pu+c;

        System.out.println(totalBill);
    }
}
