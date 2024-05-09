package ua.hillel.kalina.lessons.lesson_036;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);

        // Пример использования OrderService
        OrderService orderService = context.getBean(OrderService.class);

        // Добавление заказа
        Order order1 = new Order();
        order1.setDate(new Date());
        order1.setCost(100.0);
        orderService.addOrder(order1);

        // Получение заказа по id
        Optional<Order> retrievedOrder = orderService.getOrderById(order1.getId());
        if (retrievedOrder.isPresent()) {
            System.out.println("Retrieved Order: " + retrievedOrder.get());
        } else {
            System.out.println("Order not found");
        }

        // Получение всех заказов
        List<Order> allOrders = orderService.getAllOrders();
        System.out.println("All Orders:");
        allOrders.forEach(System.out::println);

        // Удаление заказа
        orderService.deleteOrder(order1.getId());

        // Проверка удаления
        retrievedOrder = orderService.getOrderById(order1.getId());
        if (retrievedOrder.isPresent()) {
            System.out.println("Order still exists");
        } else {
            System.out.println("Order deleted successfully");
        }
    }
}

