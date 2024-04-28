package ua.hillel.kalina.lessons.lesson_032;

public class Main {


    public static void main(String[] args) {

        CacheManager cacheManager = new CacheManager();

        cacheManager.put("users", "john_doe", new User("John Doe", 30));
        cacheManager.put("users", "jane_smith", new User("Jane Smith", 25));

        cacheManager.get("users", "john_doe");
        cacheManager.get("users", "jane_smith");
        cacheManager.get("products", "product_1");

        cacheManager.isCacheExist("users");
        cacheManager.isCacheExist("products");

        cacheManager.clear("users");
        cacheManager.clearAll();
    }
}