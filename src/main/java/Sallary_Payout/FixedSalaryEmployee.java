package Sallary_Payout;

class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary){
        this.salary=salary;
    }

    public double calculateSalary(){
        return this.salary;
    }

}
