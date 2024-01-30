package ua.hillel.kalina.lessons.lesson_015;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Product {

    private int id;
    private String type;
    private double price;
    private boolean discountAvailable;
    private LocalDate dateAdded;


    public Product(int id, String type, double price, boolean discountAvailable, LocalDate dateAdded) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.discountAvailable = discountAvailable;
        this.dateAdded = dateAdded;
    }


}


