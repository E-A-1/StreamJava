package practicePrincy;

public class Manager extends Employee {
    Manager(int basicsalary, int specialallowance, int hra, String employeename,
            String employeeid, String role) {
        super(basicsalary, amspecialallowance, hra, employeename, employeeid, role);
        System.out.println("Inside the constructor");

    }
}