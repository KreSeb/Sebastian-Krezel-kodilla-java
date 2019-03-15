package ATM;

public interface Cashpoint {

    void payment(int amountPayment);

    void payout(int amountPayout);

    default void connection() {
        System.out.println();
        System.out.println("Good morning !");
        System.out.println("Please wait, establishing connection....");
        System.out.println(" .... CONNECTED");
    }

    static void disconnection() {
        System.out.println("Transaction ended. System DISCONNECTED.");
        System.out.println("Good Bye! Have a nice day!");
    }
}
