import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleManager extends Employee{
    private double totalSales;
    private double bonus;

    public SaleManager(String name, int age, boolean married, String company,
                       String position, double baseSalary, double totalSales,
                       double bonus) {
        super(name, age, married, company, position, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Объем продаж: " + totalSales);
        System.out.println("Бонус в процентах: " + bonus);

    }

    double calculateSalary(){
        return getBaseSalary() * (1 + getBonus());
    }
}
