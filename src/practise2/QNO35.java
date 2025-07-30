package practise2;

import java.util.Scanner;

class InvalidEmployeeCode extends Exception {
    public InvalidEmployeeCode(String message) {
        super(message);
    }
}

class Employee {
    private String empCode;
    private String empName;
    private int empAge;

    public Employee(String empCode, String empName, int empAge) {
        this.empCode = empCode;
        this.empName = empName;
        this.empAge = empAge;
    }

    public void displayDetails() {
        System.out.println("Employee Code: " + empCode);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
    }
}

public class QNO35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee code (format: EX123): ");
        String code = sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee age: ");
        int age = sc.nextInt();

        try {
            if (!code.matches("EX\\d{3}")) {
                throw new InvalidEmployeeCode("Invalid Employee Code");
            }
            Employee e = new Employee(code, name, age);
            e.displayDetails();
        } catch (InvalidEmployeeCode e) {
            System.out.println(e.getMessage());
        }
    }
}

