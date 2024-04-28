package ua.hillel.kalina.lessons.lesson_032;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CacheManager {
    private static final Logger LOGGER = Logger.getLogger(CacheManager.class.getName());
    private final Map<String, Object> cacheMap;

    public CacheManager() {
        cacheMap = new HashMap<>();
    }


    public boolean put(String cache, String key, Object o) {
        cacheMap.put(cache + ":" + key, o);
        LOGGER.log(Level.INFO, "Добавлен объект с ключом {0} в кэш {1}", new Object[]{key, cache});
        return true;
    }

    public Object get(String cache, String key) {
        Object obj = cacheMap.get(cache + ":" + key);
        if (obj != null) {
            LOGGER.log(Level.INFO, "Получен объект с ключом {0} из кэша {1}", new Object[]{key, cache});
        } else {
            LOGGER.log(Level.WARNING, "Объект с ключом {0} не найден в кэше {1}", new Object[]{key, cache});
        }
        return obj;
    }


    public void clear(String cache) {
        cacheMap.keySet().removeIf(key -> key.startsWith(cache + ":"));
        LOGGER.log(Level.INFO, "Кэш {0} очищен", cache);
    }


    public void clearAll() {
        cacheMap.clear();
        LOGGER.log(Level.INFO, "Все кэши очищены");
    }

    public void isCacheExist(String cache) {
        boolean exists = cacheMap.keySet().stream().anyMatch(key -> key.startsWith(cache + ":"));
        if (exists) {
            LOGGER.log(Level.INFO, "Кэш {0} существует", cache);
        } else {
            LOGGER.log(Level.WARNING, "Кэш {0} не существует", cache);
        }
    }

}
