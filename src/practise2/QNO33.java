package practise2;

class LowSalException extends Exception {
    public LowSalException(String message) {
        super(message);
    }
}

class Emp {
    int empId;
    String empName;
    String designation;
    double basic;
    private double hra;

    public Emp(int empId, String empName, String designation, double basic) throws LowSalException {
        if (basic < 50000) {
            throw new LowSalException("Basic salary is less than 50000");
        }
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.basic = basic;
        calculateHRA();
    }

    private void calculateHRA() {
        switch (designation) {
            case "Manager":
                hra = 0.10 * basic;
                break;
            case "TeamLeader":
                hra = 0.12 * basic;
                break;
            case "HR":
                hra = 0.05 * basic;
                break;
            default:
                hra = 0.0;
        }
    }

    public double getHRA() {
        return hra;
    }

    public void printDET() {
        System.out.println("Emp ID: " + empId);
        System.out.println("Emp Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Basic: " + basic);
        System.out.println("HRA: " + hra);
    }
}

public class QNO33 {
    public static void main(String[] args) {
        try {
            Emp e = new Emp(101, "Vishwas", "Manager", 55000);
            e.printDET();
        } catch (LowSalException e) {
            System.out.println(e.getMessage());
        }
    }
}

