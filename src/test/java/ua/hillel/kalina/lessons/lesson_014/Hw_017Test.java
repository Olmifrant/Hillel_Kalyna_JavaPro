package ua.hillel.kalina.lessons.lesson_014;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Hw_017Test {


    @Test
    @DisplayName("Среднее арифметическое")
    void averageSum() {

        Hw_017 hw = new Hw_017();

        List<Integer> list = List.of(10,10,5,5,20);
        List<Integer> lis = List.of(15,40,25,5,20);

        assertEquals(10, hw.averageSum(list));
        assertEquals(21,hw.averageSum(lis));
        assertThrows(NullPointerException.class, () ->  hw.averageSum(null));
        System.out.println("averageSum PASS");
    }

    @Test
    @DisplayName("Слова без больших букв и с длиной 4 символа")
    void filterText() {

        List list = List.of("дома, сама, стал, либо, либо, хоть, меня, тому, моих, моем, себя, тебя");
        List lis = List.of("дома, сама, стал, либо, хоть, меня, тому, моих, моем, себя, тебя");

        String string = "Утром, когда я проснулся, Флоры дома уже не было. Никакой записки она не оставила. Горничная подала мне завтрак на кухне, а сама отправилась по своим делам. " +
                "Я не стал расспрашивать ее ни о чем, поскольку она либо действительно ничего не знала, либо не имела права сказать мне хоть что-то из того, что меня интересовало. " +
                "К тому же она, несомненно, донесла бы о моих расспросах Флоре. Итак, поскольку дом был в полном моем распоряжении," +
                " я решил отправиться в библиотеку и там попробовать что-то разузнать. Кроме того, я вообще люблю библиотеки. " +
                "Я прекрасно чувствую себя в окружении множества книг, в которых столько прекрасных и мудрых слов. Всегда как-то спокойнее, когда что-то отгораживает тебя от Царства Теней.";


        Hw_017 hw = new Hw_017();

        assertEquals(list.toString(), hw.filterText(string).toString());
        assertNotEquals(lis.toString(), hw.filterText(string).toString());
        assertThrows(NullPointerException.class, () -> hw.filterText(null));
        System.out.println("filterText PASS");
    }





}