package ua.hillel.kalina.lessons.lesson_033;

import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private BigDecimal cost;
}
