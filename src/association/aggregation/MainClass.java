package association.aggregation;

import java.util.Arrays;

public class MainClass {

  public static void main(String[] args) {
    
    Student student1 = new Student("Gaurav", 1, "IT");
    Student student2 = new Student("Prabhat", 2, "IT");
    Student student3 = new Student("Himanshu", 3, "IT");
    Student student4 = new Student("Shubham", 1, "CS");
    Student student5 = new Student("Paras", 1, "CS");
    Student student6 = new Student("Suman", 1, "ME");
    Student student7 = new Student("Priya", 1, "ME");
    Student student8 = new Student("Gauri", 1, "ME");

    Department department1 = new Department("IT", Arrays.asList(student1, student2, student3));
    Department department2 = new Department("CS", Arrays.asList(student4, student5));
    Department department3 = new Department("ME", Arrays.asList(student6, student7, student8));

    Institute institute =
        new Institute("KNIT", Arrays.asList(department1, department2, department3));
    System.out
        .print("Total Number of students in the institute are: " + institute.getTotalStudents());
  }

}
