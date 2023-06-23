package practicePrincy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String roleName = "";
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        System.out.println(value);
        Employee emp;
        if (value.equals("Manager")) {
            System.out.println("Inisde the manager");
            emp = new Manager(50000, 0, 3000, "GK", "1001", "Manager");
            emp.calculateNetSalary(0.2);

        } else if (value == "Assist Manager") {
            System.out.println("Inisde the ass manager");

            emp = new AssistantManager(50000, 0, 3000, "GK", "1001", "Ass Manager");
            emp.calculateNetSalary(0.15);
        }
    }
}
