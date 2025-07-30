package practise;

abstract class WorkerQNO13 {
    protected String name;
    protected double salaryRate;

    public WorkerQNO13(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public abstract double pay(int hours);

    public void displayPay(int hours) {
        System.out.println("Name: " + name + ", Pay: ₹" + pay(hours));
    }
}

class DailyWorkerQNO13 extends WorkerQNO13 {

    public DailyWorkerQNO13(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay(int hours) {
        return salaryRate * hours;
    }
}

class SalariedWorkerQNO13 extends WorkerQNO13 {

    public SalariedWorkerQNO13(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay(int hours) {
        return salaryRate * 40; // fixed 40 hours payment
    }
}

public class QNO13 {

    public static void main(String[] args) {
        WorkerQNO13 dailyWorker = new DailyWorkerQNO13("Ravi", 150); // ₹150/hour
        WorkerQNO13 salariedWorker = new SalariedWorkerQNO13("Meena", 200); // ₹200/hour

        System.out.println("---- Daily Worker Pay (worked 38 hours) ----");
        dailyWorker.displayPay(38);

        System.out.println("---- Salaried Worker Pay (worked 38 hours) ----");
        salariedWorker.displayPay(38);

        System.out.println("---- Salaried Worker Pay (worked 45 hours) ----");
        salariedWorker.displayPay(45); // still gets for 40 hours only
    }
}

