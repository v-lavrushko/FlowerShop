public class PayingMethod {
    private Payment payment;

    public PayingMethod(Payment payment) {
        this.payment = payment;
    }

    public int pay(double price) {
        return this.payment.payForBouquet(price);
    }
}
