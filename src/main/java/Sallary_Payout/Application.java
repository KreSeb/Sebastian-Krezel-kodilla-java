package Sallary_Payout;

public class Application {
    public static void main(String[] args) {
        FixedSalaryEmployee fixedemployee = new FixedSalaryEmployee(2000);
        HourlySalaryEmployee hourlyEmployee = new HourlySalaryEmployee(40, 19);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(hourlyEmployee);
        processor.processPayout();
        System.out.println("");
        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(fixedemployee);
        processor1.processPayout();
        System.out.println();
        HourlySalaryEmployee pieceEmployee = new HourlySalaryEmployee(39, 5);
        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(pieceEmployee);
        processor2.processPayout();

        double bonusFixedEmploye = fixedemployee.calculateSalary() * 1.2;
        System.out.println(       );
        System.out.println("Employee get salaty: " + bonusFixedEmploye);

    }
}
