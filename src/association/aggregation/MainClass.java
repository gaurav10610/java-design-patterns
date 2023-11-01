package association.aggregation;

import java.util.Arrays;

/**
 * 
 * Aggregation is weak form of association.
 * 
 * In an aggregation relationship, the associated objects can exist
 * independently within the scope of the system.
 * 
 */
public class MainClass {

	public static void main(String[] args) {

		Department department1 = new Department("IT", Arrays.asList(new Student("Gaurav", 1, "IT"),
				new Student("Prabhat", 2, "IT"), new Student("Himanshu", 3, "IT")));

		Department department2 = new Department("CS",
				Arrays.asList(new Student("Shubham", 1, "CS"), new Student("Paras", 1, "CS")));

		Department department3 = new Department("ME", Arrays.asList(new Student("Shikha", 1, "ME"),
				new Student("Priya", 1, "ME"), new Student("Gauri", 1, "ME")));

		Institute institute = new Institute("KNIT", Arrays.asList(department1, department2, department3));

		System.out.printf("Total Number of students in the institute are: %s", institute.getTotalStudents());
	}

}
