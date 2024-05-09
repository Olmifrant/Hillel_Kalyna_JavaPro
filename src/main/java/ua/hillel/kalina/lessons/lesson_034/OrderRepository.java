package ua.hillel.kalina.lessons.lesson_034;

import java.util.List;

public interface OrderRepository {

    Order getOrderById(Long id);
    List<Order> getAllOrders();
    void addOrder(Order order);

}
