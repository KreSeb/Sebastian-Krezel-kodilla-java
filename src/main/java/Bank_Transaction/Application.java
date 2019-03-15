package Bank_Transaction;

public class Application {

    public static void main(String[] Args) {

        ATM atm = new ATM(1200);
        AtmToBank bankOperations = new AtmToBank();


        atm.insertCard();
        atm.enterPin();
        atm.enterAmout();
        atm.payment();
        bankOperations.runProcess();
        atm.thanking();


    }
}
