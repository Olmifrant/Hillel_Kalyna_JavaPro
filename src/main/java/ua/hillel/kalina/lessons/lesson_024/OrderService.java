package ua.hillel.kalina.lessons.lesson_024;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import static spark.Spark.*;

public class OrderService {
    private static List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {


        get("/order", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(orderList);
        });

        get("/order/:uuid", (request, response) -> {
            response.type("application/json");
            UUID uuid = UUID.fromString(request.params(":uuid"));

            return new Gson().toJson(orderList.stream()
                    .filter(o -> o.getUuid().equals(uuid))
                    .findFirst().orElse(null));
        });

        post("/order", (request, response) -> {
            response.type("application/json");

            Product product = new Gson().fromJson(request.body(), Product.class);

            Order order = new Order();
            order.getProducts().add(product);
            calculateTotalCost(order);

            orderList.add(order);
            return new Gson().toJson(order);
        });

        put("/order/:uuid", (request, response) -> {
            response.type("application/json");
            UUID uuid = UUID.fromString(request.params(":uuid"));

            Order order = orderList.stream()
                    .filter(o -> o.getUuid().equals(uuid))
                    .findFirst().orElse(null);

            if (order != null) {
                Product product = new Gson().fromJson(request.body(), Product.class);
                order.getProducts().add(product);
                calculateTotalCost(order);
                order.setUpdatedAt(System.currentTimeMillis());
                return new Gson().toJson(order);
            } else {
                response.status(404);
                return "Order not found";
            }
        });

        delete("/order/:uuidOrder/:uuidProduct", (request, response) -> {
            response.type("application/json");

            UUID uuidOrder = UUID.fromString(request.params(":uuidOrder"));
            UUID uuidProduct = UUID.fromString(request.params(":uuidProduct"));

            Order order = orderList.stream()
                    .filter(o -> o.getUuid().equals(uuidOrder))
                    .findFirst().orElse(null);

            if (order != null) {
                Product productToRemove = order.getProducts().stream()
                        .filter(p -> p.getUUID().equals(uuidProduct))
                        .findFirst().orElse(null);

                if (productToRemove != null) {
                    order.getProducts().remove(productToRemove);
                    calculateTotalCost(order);
                    return new Gson().toJson(order);
                } else {
                    response.status(404);
                    return "Product not found in order";
                }
            } else {
                response.status(404);
                return "Order not found";
            }
        });
    }

    private static void calculateTotalCost(Order order) {
        order.setCost(order.getProducts().stream()
                .mapToDouble(p -> p.getCount() * p.getCost())
                .sum());
    }

}