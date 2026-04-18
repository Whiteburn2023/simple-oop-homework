package app;

import entity.Employee;
import entity.Person;
import entity.SaleManager;
import lombok.NonNull;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.Objects;

//@UtilityClass
public class PersonApp {

    public static void infoEmployee( Employee[] employees) {
//        if (employees == null) return;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null)
//            employees[i].display();
//            System.out.println("-----");
//        }
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .forEach(Person::display);
    }

    public static double salaryEmployee(Employee[] employees) {
        if (employees == null) throw new NullPointerException();
//        double sum = 0;
//        for (int i = 0; i < employees.length; i++) {
//            sum += employees[i].calculateSalary();
//        }
//        return sum;
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .mapToDouble(Employee::calculateSalary)
                .sum();

    }

    public static double companyIncome(Employee[] employees) {
        if (employees == null) throw new NullPointerException();
//        double sum = 0;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] instanceof SaleManager) {
//                sum += ((SaleManager) employees[i]).getTotalSales();
//            }
//        }
//        return sum;
        return Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(employee -> employee.getClass().equals(SaleManager.class))
                .map(employee -> (SaleManager)employee)
                .mapToDouble(SaleManager::getTotalSales)
                .sum();
    }

    public static boolean findEmployee(Employee[] employees, Employee employee) {
        if (employees == null || employee == null) {
            return false;
        }
//        boolean isName = false;
//        for (Employee emp : employees) {
//            if (emp.equals(employee)) {
//                isName = true;
//                break;
//            }
//        }
//        return isName;
        return Arrays.asList(employees).contains(employee);


    }
}
