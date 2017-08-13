package coreservlets;

import java.util.*;

public class EmployeeTest {
  public static void main(String[] args) {
    Map<String, String> employeeTable = new HashMap<>();
    employeeTable.put("a1234", "Steve Jobs");
    employeeTable.put("a1235", "Scott McNealy");
    employeeTable.put("a1236", "Jeff Bezos");
    employeeTable.put("a1237", "Larry Ellison");
    employeeTable.put("a1238", "Bill Gates");
    String[] testIds = {"a1235", "a1238", "a1234",
                        "b1234", "q1234", "zz22b" };
    for(String id: testIds) {
      String name = employeeTable.get(id);
      if (name != null) {
        System.out.printf("The id '%s' is for '%s'.%n",
                          id, name);
      } else {
        System.out.printf("No employee with id '%s'.%n", id);
      }
    }
  }
}
