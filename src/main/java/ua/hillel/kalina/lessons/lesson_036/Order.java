package ua.hillel.kalina.lessons.lesson_036;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double cost;


    @OneToMany(mappedBy = "order")
    private List<Product> products;


}
