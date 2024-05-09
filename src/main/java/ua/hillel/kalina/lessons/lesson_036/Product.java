package ua.hillel.kalina.lessons.lesson_036;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double cost;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
