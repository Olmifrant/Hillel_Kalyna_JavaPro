package ua.hillel.kalina.lessons.lesson_010.Hw_13;

public class Order {
    private String name;
    private Integer numm;

    public Order(String name, Integer numm) {

        this.name = name;
        this.numm = numm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumm() {
        return numm;
    }

    public void setNumm(Integer numm) {
        this.numm = numm;
    }

}



