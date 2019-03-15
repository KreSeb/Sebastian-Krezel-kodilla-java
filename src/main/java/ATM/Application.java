package ATM;

public class Application {
    public static void main(String[] args) {
        ATMImpl atmImpl = new ATMImpl();
        atmImpl.connection();
        atmImpl.payment(300);
        Cashpoint.disconnection();

        atmImpl.connection();
        atmImpl.payout(100);
        Cashpoint.disconnection();
    }
}
