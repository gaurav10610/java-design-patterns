package association.aggregation;

import java.util.List;

public class Institute {

  private String name;
  private List<Department> departments;

  public Institute(String name, List<Department> departments) {
    this.name = name;
    this.departments = departments;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Department> getDepartments() {
    return departments;
  }

  public void setDepartments(List<Department> departments) {
    this.departments = departments;
  }

  public int getTotalStudents() {
    int count = 0;
    for (Department department : departments) {
      count = count + department.getStudents().size();
    }
    return count;
  }
}
