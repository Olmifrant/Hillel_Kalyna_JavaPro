package ua.hillel.kalina.lessons.lesson_024;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class Order {

    private UUID uuid;
    private long createdAt;
    private long updatedAt;
    private double cost;
    private List<Product> products = new ArrayList<>();

    public Order() {
        this.uuid = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = this.createdAt;
    }
}
