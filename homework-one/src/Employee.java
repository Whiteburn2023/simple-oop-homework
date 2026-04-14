import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee extends Person{
    private String company;
    private String position;
    private double baseSalary;

    public Employee(String name, int age, boolean married, String company, String position, double baseSalary) {
        super(name, age, married);
        this.company = company;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Компания: " + company);
        System.out.println("Должность: " + company);
        System.out.println("Зарплата(Оклад): " + baseSalary);

    }
}
