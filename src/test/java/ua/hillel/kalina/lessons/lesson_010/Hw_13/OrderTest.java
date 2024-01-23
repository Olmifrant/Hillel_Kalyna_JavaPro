package ua.hillel.kalina.lessons.lesson_010.Hw_13;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    String clients1 = "Oleg";


    @Test
    @DisplayName("getName")
    void getName() {
        Order order = new Order();

        order.setName(clients1);
        assertEquals(clients1, order.getName());

    }

    @Test
    @DisplayName("getNumm")
    void getNumm() {

        Order order = new Order();
        order.setNumm(5);
        assertEquals(5, order.getNumm());
    }

    @Test
    @DisplayName("setName")
    void setName() {
        Order order = new Order();

        order.setName(clients1);
        assertEquals(clients1, order.getName());

    }

    @Test
    @DisplayName("setNumm")
    void setNumm() {

        Order order = new Order();

        order.setNumm(5);
        assertEquals(5,order.getNumm());

    }

    @Test
    @DisplayName("setNummInvalid")
    void setNummInvalid() {

        Order order = new Order();

        assertThrows(NumberFormatException.class, () -> order.setNumm(Integer.valueOf(clients1)));

    }
}