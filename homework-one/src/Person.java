import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public void display(){
        System.out.println("Имя: " + name);
        System.out.println("возраст: " + age);
        System.out.println(married ? "в браке" : "не в браке");
    }

}
