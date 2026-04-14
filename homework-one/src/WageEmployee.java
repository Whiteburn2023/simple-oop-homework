import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WageEmployee extends Employee{
    private double hours;
    private double wage;

    public WageEmployee(String name, int age, boolean married, String company,
                        String position, double baseSalary, double hours,
                        double wage) {
        super(name, age, married, company, position, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Отработанные часы: " + hours);
        System.out.println("Часовая ставка: " + wage);

    }

    double calculateSalary(){
        return getBaseSalary() + (hours * wage);
    }
}
