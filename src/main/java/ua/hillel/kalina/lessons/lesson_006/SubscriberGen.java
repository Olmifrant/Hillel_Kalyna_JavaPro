package ua.hillel.kalina.lessons.lesson_006;

public class SubscriberGen {
    public static Subscriber[] genSubArray() {

        Subscriber[] array = new Subscriber[10];

        array[0] = new Subscriber(1, "Ланнистер", "Тирион", "Ланниспорт",
                "+380500000001", 25, 300, 50, 450);
        array[1] = new Subscriber(2, "Сноу", "Джон", "Винтерфелл",
                "+380638214587", 15, 250, 50, 110);
        array[2] = new Subscriber(3, "Ланнистер", "Серсея", "Ланниспорт",
                "+380634789685", 450, 45, 10, 141);
        array[3] = new Subscriber(4, "Старк", "Эддарк", "Винтерфелл",
                "+380635216396", 500, 500, 31, 40);
        array[4] = new Subscriber(5, "Старк", "Робб", "Винтерфелл",
                "+380504856310", -75, 51, 50, 51);
        array[5] = new Subscriber(6, "Старк", "Арья", "Винтерфелл",
                "+380997521385", 100, 303, 50, 443);
        array[6] = new Subscriber(7, "Ланнистер", "Тайвин", "Ланниспорт",
                "+380501238546", 1000, 10, 15, 414);
        array[7] = new Subscriber(8, "Старк", "Брандон", "Винтерфелл",
                "+380638245612", -41, 5, 50, 40);
        array[8] = new Subscriber(9, "Старк", "Кейтлин", "Винтерфелл",
                "+380417895230", 110, 45, 41, 484);
        array[9] = new Subscriber(10, "Ланнистер", "Джейме", "Ланниспорт",
                "+380738524163", 210, 2, 47, 274);


        return array;

    }
}
