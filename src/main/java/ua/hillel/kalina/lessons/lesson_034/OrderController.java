package ua.hillel.kalina.lessons.lesson_034;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderController {


    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return orderRepository.getOrderById(id);
    }

    @GetMapping("/")
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    @PostMapping("/")
    public void addOrder(@RequestBody Order order) {
        orderRepository.addOrder(order);
    }
}

