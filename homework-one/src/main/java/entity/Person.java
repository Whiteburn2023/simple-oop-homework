package entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class Person {

    String name;
    int age;
    boolean married;

    public void display(){
        System.out.println(this);
    }
}
