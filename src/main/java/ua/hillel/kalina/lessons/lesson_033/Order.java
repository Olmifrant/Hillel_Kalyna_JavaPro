package ua.hillel.kalina.lessons.lesson_033;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Order {

    private Long id;
    private Date date;
    private BigDecimal cost;
    private List<Product> products;
}
