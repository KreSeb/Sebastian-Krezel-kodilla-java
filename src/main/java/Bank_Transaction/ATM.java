package Bank_Transaction;

public class ATM {
    private int cash;

    public ATM(int cash){
        this.cash=cash;
    }

    public void insertCard(){
        System.out.println("Please insert card....");
    }

    public void enterPin(){
        System.out.println("Please enter PIN: ");
    }

    public void enterAmout(){
        System.out.println("Please enter amoust in zł: ");
    }

    public void payment(){
        System.out.println("Counting cash. Please Wait.....");
        System.out.println("Please get requested " + cash +" zł from drawer");
    }

    public void thanking(){
        System.out.println("Thank You for using ouers ATM machines");
    }
}
