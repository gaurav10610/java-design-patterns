package structural.composite;

public class MainClass {

  public static void main(String[] args) {
    Employee ceo = new Employee("Gaurav", "DI", 1000000);
    Employee head1 = new Employee("head1", "DI", 1000000);
    Employee head2 = new Employee("head2", "DI", 1000000);
    Employee developer1 = new Employee("developer1", "DI", 1000000);
    Employee developer2 = new Employee("developer2", "DI", 1000000);
    Employee sales1 = new Employee("sales1", "DI", 1000000);
    Employee sales2 = new Employee("sales2", "DI", 1000000);

    ceo.addSubordinate(head1);
    ceo.addSubordinate(head2);
    head1.addSubordinate(developer1);
    head1.addSubordinate(developer2);
    head2.addSubordinate(sales1);
    head2.addSubordinate(sales2);

    System.out.println("Printing all employees beside CEO");
    ceo.getSubordinates().forEach((employee) -> {
      System.out.println(employee.toString());
      employee.getSubordinates().forEach((subordinate) -> {
        System.out.println(subordinate.toString());
      });
    });
  }
}
