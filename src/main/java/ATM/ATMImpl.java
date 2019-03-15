package ATM;

public class ATMImpl implements Cashpoint {

    public void payment(int amountPayment) {
        System.out.println("Przyjęto kwotę do wpłaty w wysokości " + amountPayment);
        System.out.println("Wpłacono " + amountPayment + " zł");

    }

    public void payout(int amountPayout) {
        System.out.println("Przyjęto kwotę do wypłaty w wysokości " + amountPayout);
        System.out.println(("Wypłacono " + amountPayout + " zł"));
    }
}
