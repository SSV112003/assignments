package practise2;

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class firstEmployee {
    private int id;
    private String name;
    private double salary;

    public firstEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class EmployeeService {
    public void validateSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative.");
        }
    }

    public void processSalary(firstEmployee emp) throws InvalidSalaryException {
        validateSalary(emp.getSalary());
        System.out.println("Processing salary for: " + emp.getName());
    }

    public void startProcess(firstEmployee emp) throws InvalidSalaryException {
        processSalary(emp);
    }
}

public class QNO47 {

    public static void main(String[] args) {
        firstEmployee emp = new firstEmployee(1, "Vishwas", -50000);
        EmployeeService service = new EmployeeService();

        try {
            service.startProcess(emp);
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

