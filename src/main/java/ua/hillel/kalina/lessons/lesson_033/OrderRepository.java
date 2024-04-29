package ua.hillel.kalina.lessons.lesson_033;

import java.util.List;

public interface OrderRepository {

    Order findById(Long id);

    List<Order> findAll();

    void addOrder(Order order);
}

