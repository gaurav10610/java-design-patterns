package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.subordinates = new ArrayList<Employee>();
	}

	public void removeSubordinate(Employee employee) {
		subordinates.remove(employee);
	}

	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	@Override
	public String toString() {
		return name + ", " + dept + ", " + salary;
	}

}
