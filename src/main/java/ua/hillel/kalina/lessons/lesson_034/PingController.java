package ua.hillel.kalina.lessons.lesson_034;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }
}
