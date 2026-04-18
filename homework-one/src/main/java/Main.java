import app.PersonApp;
import entity.Employee;
import entity.Manager;
import entity.SaleManager;
import entity.WageEmployee;

public class Main {
    public static void main(String[] args) {


        Manager manager1 = new Manager("Bob", 23, true, "Tabasco", "менеджер", 1000.20, 2);
        Manager manager2 = new Manager("John", 31, false, "Astoria", "менеджер", 1200.10, 3);
        Manager manager3 = new Manager("Mary", 44, false, "Tabasco", "менеджер", 1400.40, 4);
        WageEmployee wageEmployee1 = new WageEmployee("Dilan", 33, true, "Astoria", "сотрудник", 500.0, 7, 110.0);
        WageEmployee wageEmployee2 = new WageEmployee("Clay", 27, true, "Tabasco", "сотрудник", 550.0, 6, 120.0);
        WageEmployee wageEmployee3 = new WageEmployee("Fred", 33, true, "Tabasco", "сотрудник", 610, 8, 130.0);
        WageEmployee wageEmployee4 = new WageEmployee("Sten", 28, false, "Astoria", "сотрудник", 580.0, 8, 130.0);
        SaleManager saleManager1 = new SaleManager("Marty", 43, true, "Astoria", "продавец", 1500.0, 600000.0, 5);
        SaleManager saleManager2 = new SaleManager("Kenny", 51, false, "Tabasco", "продавец", 1600.0, 580000.0, 6);
        SaleManager saleManager3 = new SaleManager("Fry", 47, true, "Tabasco", "продавец", 1800.0, 710000.0, 7);

        Employee[] employees = new Employee[]{manager1, null, manager3, wageEmployee1, wageEmployee2, wageEmployee3, wageEmployee4, saleManager1, saleManager2, saleManager3};

        PersonApp.infoEmployee(employees);
        System.out.println(PersonApp.salaryEmployee(employees));
        System.out.println(PersonApp.companyIncome(employees));
        System.out.println(PersonApp.findEmployee(employees, manager2));
    }
}
