import java.util.Scanner;

public class CashPayment implements Payment{
    @Override
    public int payForBouquet(double price) {
        Scanner cashmachine = new Scanner(System.in);
        System.out.printf("That will be %f $, sweetheart\n", price);
        double cash = cashmachine.nextDouble();
        System.out.printf("Your change: %f\n", cash - price);
        return 0;
    }
}
