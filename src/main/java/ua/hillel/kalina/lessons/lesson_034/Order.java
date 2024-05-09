package ua.hillel.kalina.lessons.lesson_034;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Order {

    private Long id;
    private Date date;
    private double cost;
    private List<Product> products;
}
