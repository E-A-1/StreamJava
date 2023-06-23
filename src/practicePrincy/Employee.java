package practicePrincy;

public class Employee implements EmployeeInterface {
    String employeeid;
    String employeename;
    int basicsalary;
    int specialallowance;
    int hra;
    int transportallowance;
    String role;
    int tax = 2500;
    static int mspecialallowance = 20000;
    static int amspecialallowance = 12000;

    Employee() {

    }

    Employee(int basicsalary, int specialallowance, int hra, String employeename,
            String employeeid, String role) {
        this.basicsalary = basicsalary;
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.hra = hra;
        this.role = role;
        this.specialallowance = specialallowance;
    }

    @Override
    public double calculateNetSalary(double allowancePercent) {
        System.out.println("Inside the calculate method");
        this.transportallowance = transportallowance;

        double netsalary;
        // TODO Auto-generated method stub

        netsalary = basicsalary + hra + mspecialallowance + (allowancePercent * basicsalary) - tax;

        System.out.println("The Net salary of the employee" + employeename + "is " + netsalary);
        return netsalary;
    }
}