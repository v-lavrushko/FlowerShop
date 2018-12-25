import java.util.Scanner;

public class CardPayment implements Payment {
    @Override
    public int payForBouquet(double price) {
        Scanner terminal = new Scanner(System.in);
        System.out.printf("That will be %f $, sweetheart\nEnter your pin-code: ", price);
        String  password = terminal.next();
        return 0;
    }
}