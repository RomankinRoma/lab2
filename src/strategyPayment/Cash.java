package strategyPayment;

public class Cash implements PaymentSystem {
    @Override
    public String details(int amount) {
        return "Successful";
    }
}
