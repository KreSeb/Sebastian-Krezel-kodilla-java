package Sallary_Payout;

public class SalaryPayoutProcessor extends SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {
        System.out.println("Sendihng money to meployee");
    }
}
