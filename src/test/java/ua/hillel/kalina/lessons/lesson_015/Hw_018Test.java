package ua.hillel.kalina.lessons.lesson_015;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class Hw_018Test {



    public static List base(){

        List<Product> products = List.of(


                new Product(1, "Book", 50, false, LocalDate.of(2021, 1, 15)),
                new Product(2, "Lap", 3000, true, LocalDate.of(2021, 5, 20)),
                new Product(3, "Book", 300, true, LocalDate.of(2022, 2, 10)),
                new Product(4, "Book", 350, false, LocalDate.of(2022, 3, 5)),
                new Product(5, "Lap", 500, true, LocalDate.of(2022, 4, 8)),
                new Product(6, "Book", 300, false, LocalDate.of(2023, 1, 15)),
                new Product(7, "Car", 10000, true, LocalDate.of(2023, 5, 20)),
                new Product(8, "Book", 70, true, LocalDate.of(2024, 2, 10)),
                new Product(9, "Book", 25, true, LocalDate.of(2024, 3, 5)),
                new Product(10, "Car", 1500, true, LocalDate.of(2024, 4, 8)),
                new Product(11, "TV", 700, false, LocalDate.of(2024, 4, 15)),
                new Product(12, "Handy", 650, true, LocalDate.of(2024, 4, 16)),
                new Product(13, "TV", 750, true, LocalDate.of(2024, 4, 16)),
                new Product(14, "TV", 740, true, LocalDate.of(2024, 4, 16)),
                new Product(15, "Handy", 1500, true, LocalDate.of(2024, 4, 18))

        );
        return products;
    }

    @Test
    void getExpensiveBooks() {

        List<Product> expensiveBooks = Hw_018.getExpensiveBooks(base());

        assertEquals(3, expensiveBooks.size());
        assertEquals(3, expensiveBooks.get(0).getId());
        assertEquals(4, expensiveBooks.get(1).getId());
        assertEquals(6, expensiveBooks.get(2).getId());

    }

    @Test
    void getDiscountedBooks() {

        List<Product> discountedBooks = Hw_018.getDiscountedBooks(base());

        assertEquals(3, discountedBooks.size());
        assertEquals(3, discountedBooks.get(0).getId());
        assertEquals(8, discountedBooks.get(1).getId());
        assertEquals(9, discountedBooks.get(2).getId());
    }


    @Test
    void getCheapestBook() {

        List<Product> cheapestBooks = Hw_018.getCheapestBooks(base());

        assertEquals(1, cheapestBooks.size());
        assertEquals(9, cheapestBooks.get(0).getId());
    }

    @Test
    void getLastThreeAddedProducts() {

        List<Product> lastThreeAddedProducts = Hw_018.getLastThreeAddedProducts(base());

        assertEquals(3, lastThreeAddedProducts.size());
        assertEquals(15, lastThreeAddedProducts.get(0).getId());
        assertEquals(12, lastThreeAddedProducts.get(1).getId());
        assertEquals(13, lastThreeAddedProducts.get(2).getId());
    }

    @Test
    void calculateTotalBookCost() {

        double totalBookCost = Hw_018.calculateTotalBookCost(base());

        assertEquals(95, totalBookCost);
        assertNotEquals(5, totalBookCost);
    }


    @Test
    void groupProductsByType() {

        Map<String, List<Product>> groupedProducts = Hw_018.groupProductsByType(base());

        assertEquals(5, groupedProducts.size());
        assertTrue(groupedProducts.containsKey("Book"));
        assertTrue(groupedProducts.containsKey("Lap"));
        assertTrue(groupedProducts.containsKey("Car"));
        assertTrue(groupedProducts.containsKey("TV"));
        assertTrue(groupedProducts.containsKey("Handy"));

        assertEquals(6, groupedProducts.get("Book").size());
        assertEquals(2, groupedProducts.get("Lap").size());
        assertEquals(2, groupedProducts.get("Car").size());
        assertEquals(3, groupedProducts.get("TV").size());
        assertEquals(2, groupedProducts.get("Handy").size());
        assertThrows(NullPointerException.class, ()->groupedProducts.get("tgtg").size());

    }
}