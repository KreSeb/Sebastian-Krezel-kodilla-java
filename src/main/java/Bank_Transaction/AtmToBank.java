package Bank_Transaction;

public class AtmToBank extends Bank {

    protected void paymentRequest() {
        System.out.println("From ATM to Bank....  ATM send request for get some money");
    }

    protected void checkAccountBalance() {
        System.out.println("Chcecking User account balance. Please wait");
        System.out.println("User has 3560 zł on accout");
    }

    protected void payAgreement() {
        System.out.println("You have granted agreement for payment");
    }

    public void runProcess(){
        this.checkAccountBalance();
        this.paymentRequest();
        this.payAgreement();
    }
}
