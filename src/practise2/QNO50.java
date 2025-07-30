package practise2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class QNO50 {

    public static void main(String[] args) {

        List<Employee50> employees = Arrays.asList(
                new Employee50(101, "Ravi", "HR", 50000),
                new Employee50(102, "Priya", "IT", 60000),
                new Employee50(103, "Arun", "HR", 55000),
                new Employee50(104, "Kavya", "IT", 70000),
                new Employee50(105, "Divya", "Sales", 45000)
        );

        // Q1
        System.out.println("Q1:");
        employees.stream().map(Employee50::getName).forEach(System.out::println);

        // Q2
        System.out.println("\nQ2:");
        employees.stream().filter(e -> e.getSalary() > 55000).forEach(System.out::println);

        // Q3
        System.out.println("\nQ3:");
        long hrCount = employees.stream().filter(e -> e.getDepartment().equals("HR")).count();
        System.out.println("HR count: " + hrCount);

        // Q4
        System.out.println("\nQ4:");
        employees.stream().sorted(Comparator.comparingDouble(Employee50::getSalary).reversed()).forEach(System.out::println);

        // Q5
        System.out.println("\nQ5:");
        employees.stream().max(Comparator.comparingDouble(Employee50::getSalary)).ifPresent(System.out::println);

        // Q6
        System.out.println("\nQ6:");
        double avgSalary = employees.stream().mapToDouble(Employee50::getSalary).average().orElse(0);
        System.out.println("Average Salary: " + avgSalary);

        // Q7
        System.out.println("\nQ7:");
        List<String> names = employees.stream().map(Employee50::getName).collect(Collectors.toList());
        System.out.println(names);

        // Q8
        System.out.println("\nQ8:");
        Map<String, List<Employee50>> byDept = employees.stream().collect(Collectors.groupingBy(Employee50::getDepartment));
        byDept.forEach((dept, list) -> System.out.println(dept + ": " + list));

        // Q9
        System.out.println("\nQ9:");
        Map<String, Double> totalSalaryPerDept = employees.stream()
                .collect(Collectors.groupingBy(Employee50::getDepartment, Collectors.summingDouble(Employee50::getSalary)));
        System.out.println(totalSalaryPerDept);

        // Q10
        System.out.println("\nQ10:");
        employees.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .sorted(Comparator.comparingDouble(Employee50::getSalary))
                .map(Employee50::getName)
                .forEach(System.out::println);

        // Q11
        System.out.println("\nQ11:");
        boolean anyLowSalary = employees.stream().anyMatch(e -> e.getSalary() < 40000);
        System.out.println("Any salary < 40000? " + anyLowSalary);

        // Q12
        System.out.println("\nQ12:");
        String commaSeparated = employees.stream().map(Employee50::getName).collect(Collectors.joining(", "));
        System.out.println(commaSeparated);

        // Q13
        System.out.println("\nQ13:");
        List<Employee50> top2 = employees.stream()
                .sorted(Comparator.comparingDouble(Employee50::getSalary).reversed())
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(top2);

        // Q14
        System.out.println("\nQ14:");
        employees.stream().skip(2).forEach(System.out::println);

        // Q15
        System.out.println("\nQ15:");
        employees.stream().limit(3).map(Employee50::getName).forEach(System.out::println);

        // Q16
        System.out.println("\nQ16:");
        employees.stream()
                .filter(e -> e.getDepartment().equals("HR"))
                .min(Comparator.comparingDouble(Employee50::getSalary))
                .ifPresent(System.out::println);

        // Q17
        System.out.println("\nQ17:");
        Map<Boolean, List<Employee50>> partitioned = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 55000));
        System.out.println("Salary > 55000: " + partitioned.get(true));
        System.out.println("Salary <= 55000: " + partitioned.get(false));

        // Q18
        System.out.println("\nQ18:");
        Map<String, Double> avgSalaryPerDept = employees.stream()
                .collect(Collectors.groupingBy(Employee50::getDepartment, Collectors.averagingDouble(Employee50::getSalary)));
        System.out.println(avgSalaryPerDept);

        // Q19
        System.out.println("\nQ19:");
        employees.stream()
                .sorted(Comparator.comparing(Employee50::getName).thenComparing(Employee50::getSalary))
                .forEach(System.out::println);

        // Q20
        System.out.println("\nQ20:");
        Map<Integer, String> idNameMap = employees.stream()
                .collect(Collectors.toMap(Employee50::getId, Employee50::getName));
        System.out.println(idNameMap);

        // 🔹 Challenge 1
        System.out.println("\nChallenge 1:");
        employees.stream()
                .filter(e -> e.getName().startsWith("D") && e.getName().endsWith("a"))
                .forEach(System.out::println);

        // 🔹 Challenge 2
        System.out.println("\nChallenge 2:");
        byDept.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        // 🔹 Challenge 3
        System.out.println("\nChallenge 3:");
        employees.stream()
                .map(Employee50::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(sal -> System.out.println("Second Highest Salary: " + sal));
    }
}

class Employee50 {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee50(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public String getDepartment() { return department; }

    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' +
                ", department='" + department + '\'' + ", salary=" + salary + '}';
    }
}

