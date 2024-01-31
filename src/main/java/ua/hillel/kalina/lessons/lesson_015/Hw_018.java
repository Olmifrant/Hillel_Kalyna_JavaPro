package ua.hillel.kalina.lessons.lesson_015;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Hw_018 {

    public static List<Product> getExpensiveBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.getPrice() > 250)
                .collect(Collectors.toList());
    }


    public static List<Product> getDiscountedBooks(List<Product> products) {
        return products.stream()
                .filter(product -> product.getType().equals("Book") && product.isDiscountAvailable())
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9;
                    return new Product(product.getId(), product.getType(), discountedPrice, true, product.getDateAdded());
                })
                .collect(Collectors.toList());
    }


    public static List<Product> getCheapestBooks(List<Product> products) {
        List<Product> cheapestBooks = new ArrayList<>();
        double minPrice = products.stream()
                .filter(product -> product.getType().equals("Book"))
                .mapToDouble(Product::getPrice)
                .min()
                .orElse(Double.MAX_VALUE);

        if (minPrice != Double.MAX_VALUE) {
            cheapestBooks = products.stream()
                    .filter(product -> product.getType().equals("Book") && product.getPrice() == minPrice)
                    .collect(Collectors.toList());
        }

        return cheapestBooks;
    }


    public static List<Product> getLastThreeAddedProducts(List<Product> products) {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double calculateTotalBookCost(List<Product> products) {
        return products.stream()
                .filter(product -> product.getDateAdded().getYear() == LocalDate.now().getYear())
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }


    public static Map<String, List<Product>> groupProductsByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getType));

    }


//    public void printProducts(List<Product> productList) {
//
//        System.out.println(productList);
//
//        productList.forEach(product -> {
//            System.out.println("Id: " + product.getId() +
//                    ", Type: " + product.getType() +
//                    ", Price: " + product.getPrice() +
//                    ", Discount Available: " + product.isDiscountAvailable() +
//                    ", Addition Date: " + product.getDateAdded());
//        });
//        System.out.println();
//
//    }
//
//    public void printGroupedProducts(Map<String, List<Product>> groupedProducts) {
//        groupedProducts.forEach((type, productList) -> {
//            System.out.println(type + ": ");
//            productList.forEach(product -> {
//                System.out.println("\tId: " + product.getId() +
//                        ", Type: " + product.getType() +
//                        ", Price: " + product.getPrice() +
//                        ", Discount Available: " + product.isDiscountAvailable() +
//                        ", Addition Date: " + product.getDateAdded());
//            });
//
//
//        });
//
//        System.out.println();
//    }


}










