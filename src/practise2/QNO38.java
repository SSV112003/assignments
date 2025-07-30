package practise2;

import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
	String emp_id;
	String emp_name;
	transient double emp_sal;

	public Employee(String emp_id, String emp_name, double emp_sal) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}
}

public class QNO38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		String id = sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Employee Salary: ");
		double sal = sc.nextDouble();

		Employee emp = new Employee(id, name, sal);

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
			out.writeObject(emp);
			out.close();

			System.out.println("\nSerialization complete.");
		} catch (IOException e) {
			System.out.println("Serialization Error: " + e.getMessage());
		}

		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
			Employee deserializedEmp = (Employee) in.readObject();
			in.close();

			System.out.println("\nDeserialized Employee Details:");
			System.out.println("ID: " + deserializedEmp.emp_id);
			System.out.println("Name: " + deserializedEmp.emp_name);
			System.out.println("Salary: " + deserializedEmp.emp_sal);
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Deserialization Error: " + e.getMessage());
		}
	}
}

