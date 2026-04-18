package entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
@EqualsAndHashCode
public class Manager extends Employee {
    private int grade;

    public Manager(String name, int age, boolean married, String company,
                   String position, double baseSalary, int grade) {
        super(name, age, married, company, position, baseSalary);
        setGrade(grade);
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 7)
            this.grade = grade;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * grade;
    }
}
