package ua.hillel.kalina.lessons.lesson_010.Hw_13;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

    private String name;
    private Integer numm;

    public Order(String name, Integer numm) {

        this.name = name;
        this.numm = numm;
    }

    public Order() {

    }
}



